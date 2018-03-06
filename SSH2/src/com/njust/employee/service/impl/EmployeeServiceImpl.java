package com.njust.employee.service.impl;

import com.njust.employee.dao.EmployeeDao;
import com.njust.employee.domain.Employee;
import com.njust.employee.domain.PageBean;
import com.njust.employee.service.EmployeeService;

import java.util.List;

/**
 * Created by Tree on 2017/3/13.
 *员工管理业务层的实现类
 */
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    //业务层的登陆方法
    @Override
    public Employee login(Employee employee) {
        Employee existEmplyee = employeeDao.findByUsernameAndPassword(employee);
        return existEmplyee;
    }

    @Override
    public PageBean<Employee> findByPage(Integer currPage) {
        PageBean<Employee> pageBean = new PageBean<Employee>();
        //封装当前的页数
        pageBean.setCurrPage(currPage);
        //封装当每页显示的记录数，默认为10
        int pageSize = 10;
        pageBean.setPageSize(pageSize);
        //封装当前的总记录数
        int totalCount =employeeDao.findCount();
        //System.out.println("一共有"+totalCount+"条记录");
        pageBean.setTotalCount(totalCount);
        //封装总的页数：Math.ceil向上取整
        double tc = totalCount;
        Double num = Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        //封装每页显示的数据
        int begin =(currPage-1)*pageSize;
        List<Employee> list = employeeDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);

    }

    @Override
    public Employee findById(Integer eid) {
       return employeeDao.findById(eid);
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);

    }

    @Override
    public void delete(Employee eid) {
        employeeDao.delete(eid);
    }
}
