<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head></head>
<body>
<table border="0" width="600px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 员工添加</td>
</tr>
<tr>
<td align="right" > 
<a href="javascript:document.getElementById('saveForm').submit()">保存</a> &nbsp;&nbsp;
<a href="javascript:history.go(-1)">退回</a>
</td>
</tr>
</table>
<br/>

<form id="saveForm" action="employee_save.action" method="post" >
<table border='0' cellpadding="0"  cellspacing="10">
<tr>
<td>登陆账号：</td>
<td><input type="text" name="username" /></td>
<td>密码：</td>
<td><input type="password" name="password" /></td>
</tr>

<tr>
<td>姓名：</td>
<td><input type="text" name="ename" /></td>
<td>性别：</td>
<td><s:radio name="sex" list="{'男','女'}"  theme="simple"></s:radio></td>
</tr>

<tr>
<td>出生日期：</td>
<td><input type="date" name="birthday" /></td>
<td>入职时间：</td>
<td><input type="date" name="joinDate" /></td>
</tr>

<tr>
<td>所属部门： </td>
    <td><s:select name="department.did" list="list" listKey="did" listValue="dname" headKey="" headValue="--请选择--"  theme="simple"></s:select></td>
<td>员工编号：</td>
<td><input type="text" name="eno" /></td>
</tr>
</table>
</form>

</body>
</html>