package com.njust.employee.action;


import com.njust.employee.domain.User;
import com.njust.employee.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.stereotype.Component;

/**
 * 管理员的Action类*/

@Component
public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    // 注入业务层的类
    private UserService userService;


    @Override
    public User getModel() {
        return user;
    }

    //用户登陆
    public String login() {
        //调用业务层的类
        User existUser = userService.login(user);
        if (existUser == null) {
            //登陆失败
            this.addActionError("用户名或密码错误！");
            return INPUT;
        } else {
            //登陆成功
            ActionContext.getContext().getSession().put("existUser", existUser);
            return SUCCESS;
        }
    }
}
