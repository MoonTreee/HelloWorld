package com.muke.employee.domain;

import java.util.Date;

/**
 * 员工的实体
 * Created by Tree on 2017/3/2.
 */
public class Employee {
    private Integer eid;
    private String ename;
    private String sex;
    private Date birthday;
    private Date jionDate;
    private String eno;
    private String username;
    private String password;

    //员工所属的部门
    private  Department department;

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setJionDate(Date jionDate) {
        this.jionDate = jionDate;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getJionDate() {
        return jionDate;
    }

    public String getEno() {
        return eno;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Department getDepartment() {
        return department;
    }
}
