package com.muke.employee.dao;

import com.muke.employee.domain.Employee;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Tree on 2017/3/13.
 * 员工管理DAO层的接口
 */
public interface EmployeeDao{

    Employee findByUsernameAndPassword(Employee employee);

    List<Employee> findByPage(int begin, int pageSize);

    void save(Employee employee);

    Employee findById(Integer eid);

    void update(Employee employee);

    int findCount();
}
