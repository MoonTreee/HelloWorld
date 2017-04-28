package com.muke.employee.service.impl;

import com.muke.employee.domain.PageBean;
import com.muke.employee.dao.DepartmentDao;
import com.muke.employee.domain.Department;
import com.muke.employee.service.DepartmentService;

import java.util.List;

/**
 * Created by Tree on 2017/3/14.
 * 部门管理的也为层的实现类
 */
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao;
    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    //分页查询的方法
    public PageBean<Department> findByPage(Integer currPage) {
        PageBean<Department> pageBean = new PageBean<Department>();
        //封装当前的页数
        pageBean.setCurrPage(currPage);
        //封装当每页显示的记录数，默认为10
        int pageSize = 10;
        pageBean.setPageSize(pageSize);
        //封装当前的总记录数
        int totalCount =departmentDao.findCount();
        //System.out.println("一共有"+totalCount+"条记录");
        pageBean.setTotalCount(totalCount);
        //封装总的页数：Math.ceil向上取整
        double tc = totalCount;
        Double num = Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        //封装每页显示的数据
        int begin =(currPage-1)*pageSize;
        List<Department> list = departmentDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }

    @Override
    //业务层实现 保存部门信息 的方法
    public void save(Department department) {
        departmentDao.save(department);
    }

    @Override
    public Department findById(Integer did) {
        return departmentDao.findById(did);
    }

    @Override
    //业务层实现 更新部门信息 的方法
    public void update(Department department) {
        departmentDao.update(department);

    }
}
