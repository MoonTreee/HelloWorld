package com.njust.employee.dao;

import com.njust.employee.domain.Department;

import java.util.List;

/**
 * Created by Tree on 2017/3/14.
 */
public interface DepartmentDao {
    int findCount();

    List<Department> findByPage(int begin, int pageSize);
    void save(Department department);
    Department findById(Integer did);

    void update(Department department);
}
