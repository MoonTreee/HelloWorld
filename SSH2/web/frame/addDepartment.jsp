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
<td align="center" style="font-size:24px; color:#666"> 部门添加</td>
</tr>
<tr>
<td align="right" > 
<a href="javascript:document.getElementById('saveForm').submit()">保存</a> &nbsp;&nbsp;
<a href="javascript:histoey.go(-1)">退回 </a>
</td>
</tr>
</table>
<br/>
 <br>
<form id="saveForm" action="department_save.action" method="post" enctype="multipart/form-data">
<table style="font-size::16px">
<tr>
    <td>部门名称：</td>
    <td><input type="text" name="dname" /></td>
</tr>
<tr>
    <td>部门描述：</td>
    <td><input type="text" name="ddesc" /></td>
</tr>

<tr>
  <td>部门级别：</td>
  <td>
     <select name="dictDdesc.did">
     <s:iterator value="listDict" var="d">
     	<option value="<s:property value="#d.did" />"><s:property value="#d.dname" /></option>
     </s:iterator>
     </select>
  </td>
</tr>
<tr>
  <td>选择文件：</td>
  <td>
     <input type="file" name="upload"/>
  </td>
</tr>
</table>
</form>
</body>
</html> 
