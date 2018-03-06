package com.muke.employee.action;

import com.muke.employee.domain.Employee;
import com.muke.employee.domain.PageBean;
import com.muke.employee.service.EmployeeService;
import com.muke.employee.service.impl.EmployeeServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Tree on 2017/3/13.
 * 员工管理的Action类
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
    private Employee employee = new Employee();
    //接收当前的页数，默认值为1
    private Integer currPage = 1;
    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }
    @Override
    public Employee getModel() {
        return employee;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    //注入业务层类
    private EmployeeService employeeService;

    //提供一个查询的方法
    public String findAll(){
        PageBean<Employee> pageBean=employeeService.findByPage(currPage);
        //将pageBean存入到值栈中
        ActionContext.getContext().getValueStack().push(pageBean);
        System.out.println("List详细信息：");
        System.out.println(pageBean.getList().get(0).getDepartment().getDname());
        return  "findAll";
    }

    //用户登陆
    public String login(){
        //调用业务层的类
        Employee existEmployee =employeeService.login(employee);
        if(existEmployee==null){
            //登陆失败
            this.addActionError("用户名或密码错误！");
            return INPUT;
        }else {
            //登陆成功
            ActionContext.getContext().getSession().put("existEmployee",existEmployee);
            return SUCCESS;
        }
    }
}
