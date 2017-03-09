package com.dh.ch01.framework;

import com.dh.ch01.action.AddAction;
import com.dh.ch01.action.SubtractAction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.ServerException;
import java.util.HashMap;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Controller extends HttpServlet {
    //声明Controller维护的Action映射，保存所有的Action的实例
    private HashMap actionMap;

    //Serlvet初始化
    @SuppressWarnings("unchecked")
    public  void init() throws ServletException{
        actionMap = new HashMap();
        actionMap.put("add",new AddAction());
        actionMap.put("subtract",new SubtractAction());
    }

    //根据path判断Action
    private Action determinActionByPath(String path){
        String actionName =path.substring(path.lastIndexOf("/")+1,path.length()-7);
        Action ret = (Action)actionMap.get(actionName);
        return ret;
    }

    //处理页面以get方式提交的请求
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
    throws ServletException,IOException{
        String path = request.getServletPath();
        Action action =(Action)this.determinActionByPath(path);
        String resultView = action.execute(request,response);
        if(null!=resultView){
            request.getRequestDispatcher(resultView).forward(request,response);
        }


    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
        this.doGet(request,response);
    }

}
