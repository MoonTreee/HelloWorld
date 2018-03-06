package com.njust.employee.service;

import com.njust.employee.domain.PageBean;
import com.njust.employee.domain.Department;

/**
 * Created by Tree on 2017/3/14.
 */
public interface DepartmentService {

    PageBean<Department> findByPage(Integer currPage);
    void save(Department department);
    Department findById(Integer did);
    void update(Department department);
}
