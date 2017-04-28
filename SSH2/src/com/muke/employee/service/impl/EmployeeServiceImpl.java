package com.muke.employee.service.impl;

import com.muke.employee.dao.EmployeeDao;
import com.muke.employee.domain.Employee;
import com.muke.employee.service.EmployeeService;

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
}
