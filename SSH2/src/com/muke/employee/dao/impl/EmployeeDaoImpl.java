package com.muke.employee.dao.impl;

import com.muke.employee.dao.EmployeeDao;
import com.muke.employee.domain.Employee;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Tree on 2017/3/13.
 * Dao层的实现类
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {
    @Override
    //DAO根据用户名和密码查询用户的方法
    public Employee findByUsernameAndPassword(Employee employee) {
        String hql = "from Employee  where username = ? and password = ?";
        //System.out.println(employee.getUsername());
        List<Employee> list =this.getHibernateTemplate().find(hql,employee.getUsername(),employee.getPassword());
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
