package com.njust.employee.service;

import com.njust.employee.domain.Employee;
import com.njust.employee.domain.PageBean;

/**
 * Created by Tree on 2017/3/13.
 * 员工管理业务层的接口
 */
public interface EmployeeService {
    PageBean<Employee> findByPage(Integer currPage);
    void save(Employee employee);
    Employee findById(Integer eid);
    void update(Employee employee);
    void delete(Employee eid);

}
