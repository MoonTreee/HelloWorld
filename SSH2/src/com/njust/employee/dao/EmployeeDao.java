package com.njust.employee.dao;

import com.njust.employee.domain.Employee;

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
    void delete(Employee employee);

    int findCount();
}
