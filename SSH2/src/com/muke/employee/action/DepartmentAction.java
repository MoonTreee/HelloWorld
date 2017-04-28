package com.muke.employee.action;

import com.muke.employee.domain.Department;
import com.muke.employee.domain.PageBean;
import com.muke.employee.service.DepartmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Tree on 2017/3/14.
 * 部门管理的Action类
 */
public class DepartmentAction extends ActionSupport implements ModelDriven<Department> {
    //模型驱动使用的对象
    private Department department = new Department();
    //接收当前的页数，默认值为1
    private Integer currPage = 1;
    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    @Override
    public Department getModel() {
        return department;
    }

    //注入部门管理的Service
    private DepartmentService departmentService ;
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    //提供一个查询的方法
    public String findAll(){
        PageBean<Department> pageBean=departmentService.findByPage(currPage);
        //将pageBean存入到值栈中
        ActionContext.getContext().getValueStack().push(pageBean);
        return  "findAll";
    }

    //跳转到部门“添加”页面的方法
    public String saveUI(){
        return "saveUI";
    }

    //添加部门的执行方法
    public String save(){
        departmentService.save(department);
        return "saveSuccess";
    }

    //更新部门信息的方法：先根据id返回待编辑部门的信息，再进行update
    public String edit(){
        //根据部门ID查询部门
        department = departmentService.findById(department.getDid());
        return "editSuccess";
    }
    public String update(){
        departmentService.update(department);
        return "updateSuccess";
    }
}
