<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
<div align="center">
<table border="0" width="60%" cellspacing="0" cellpadding="0" id="table1">
<tr>
<td height="93"></td>
</tr>
<tr>
<td>
<img src="<%=basePath %>images/bg.jpg"/ style="background-repeat:no-repeat" width="1500px" height="600px">
</td>
</tr>
</table>
</div>
</body>
</html>
