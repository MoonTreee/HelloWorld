<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
.div1{ margin-top:50px; margin-left:600px; font-size:14px; color:white}
</style>
</head>

<body bgcolor="#0099FF">
<div class="div1">
欢迎您： <s:property value="#session.existEmployee.ename"/>
&nbsp;&nbsp;&nbsp;&nbsp;
<s:if test="%{null!=#session.existEmployee}">
	<a href="#" onclick=top.location.replace("employee_logout.action")>退出登录</a>
</s:if>
</div>
</body>
</html>

