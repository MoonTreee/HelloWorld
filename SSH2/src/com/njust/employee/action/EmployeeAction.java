package com.njust.employee.action;

import com.njust.employee.domain.Department;
import com.njust.employee.domain.Employee;
import com.njust.employee.domain.PageBean;
import com.njust.employee.service.DepartmentService;
import com.njust.employee.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.stereotype.Component;

/**
 * Created by Tree on 2017/3/13.
 * 员工管理的Action类
 */

@Component
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
    private DepartmentService departmentService ;
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
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
        //System.out.println("List详细信息：");
        //System.out.println(pageBean.getList().get(0).getDepartment().getDname());
        return  "findAll";
    }

    //跳转到"添加用户"节目的方法，需要将所有现有的部门名称传入
    public String saveUI(){
        PageBean<Department> pageBean = departmentService.findByPage(currPage);
        //将pageBean存入到值栈中
        ActionContext.getContext().getValueStack().push(pageBean);
        return "saveUI";
    }

    //添加员工
    public String save(){
        employeeService.save(employee);
        System.out.println(employee.getDepartment());
        return "saveSuccess";
    }

    //删除员工
    public String delete(){
        employeeService.delete(employee);
        return "deleteSuccess";
    }

    //更新员工信息


    //更新部门信息的方法：先根据id返回待编辑部门的信息，再进行update
    public String edit(){
        //根据部门ID查询部门
        employee = employeeService.findById(employee.getEid());
        return "editSuccess";
    }
    public String update(){
        employeeService.update(employee);
        return "updateSuccess";
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
