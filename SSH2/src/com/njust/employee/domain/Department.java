package com.njust.employee.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 部门的实体
 * Created by Tree on 2017/3/1.
 */
public class Department {
    private Integer did;
    private String dname;
    private String ddesc;
    //员工的集合
    private Set<Employee> employees =new HashSet<Employee>();

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc;
    }

    public Integer getDid() {
        return did;
    }

    public String getDname() {
        return dname;
    }

    public String getDdesc() {
        return ddesc;
    }
}
