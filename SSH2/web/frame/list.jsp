<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
        .table1{
            border:1px solid #ddd;
            width:900px;
            
        }
        thead{
            background-color:lightblue;
        }

    </style>
</head>
<body>
<table border="0" width="900px">
<tr>
<td align="center" style="font-size:24px; color:#999"> 部门管理</td>
    <td align="center"><a href="${pageContext.request.contextPath}/department_saveUI.action">添加</a></td>
</tr>
</table>

<br/>

<table cellspacing="0" border="1" class="table1">
<thead>
<tr><th width="300">部门名称</th><th width="300">描述</th><th  width="300">编辑</th></tr>
</thead>
<tbody>
<s:iterator value="list" var="d">
<tr>
<td align="center"><s:property value="#d.dname"/></td>
<td align="center"><s:property value="#d.ddesc"/></td>
<td align="center"><a href="${pageContext.request.contextPath}/department_edit.action?did=<s:property value="#d.did"/>">编辑</a></td>
</tr>
</s:iterator>
</tbody>
</table>
<br/>


<table border="0" cellspacing="0" cellpadding="0"  width="900px">
<tr>
<td align="right">
   <span>第<s:property value="currPage"/>/<s:property value="totalPage"/>页-共<s:property value="totalCount"/>条记录</span>
   <span>
       <a href="#">[首页]</a>&nbsp;&nbsp;
       <a href="#">[上一页]</a>&nbsp;&nbsp;
       <a href="#">[下一页]</a>&nbsp;&nbsp;
       <a href="#">[尾页]</a>&nbsp;&nbsp;
   </span>
</td>
</tr>
</table>
</body>
</html>
