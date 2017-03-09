package com.dh.ch01.action;

import com.dh.ch01.biz.Calculator;
import com.dh.ch01.framework.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Administrator on 2016/12/15.
 */
public class SubtractAction implements Action{
    private Calculator biz =new Calculator();
    public String execute(HttpServletRequest request,HttpServletResponse response){
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));

        double result = biz.subtract(num1,num2);
        request.setAttribute("result",result);
        return  "add_result.jsp";
    }
}