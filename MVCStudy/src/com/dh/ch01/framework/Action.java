package com.dh.ch01.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/12/15.
 */
public interface Action {
    String execute(HttpServletRequest request,HttpServletResponse response);
}
