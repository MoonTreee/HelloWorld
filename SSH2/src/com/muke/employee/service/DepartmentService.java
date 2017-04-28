package com.muke.employee.service;

import com.muke.employee.domain.PageBean;
import com.muke.employee.domain.Department;

/**
 * Created by Tree on 2017/3/14.
 */
public interface DepartmentService {

    PageBean<Department> findByPage(Integer currPage);
    void save(Department department);
    Department findById(Integer did);
    void update(Department department);
}
