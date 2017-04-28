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
<td align="center" style="font-size:24px; color:#666"> 部门管理</td>
</tr>
<tr>
<td align="right" > <a href="<%=basePath %>frame/department_saveUI.action">添加</a></td>
</tr>
</table>
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
   <tr>
	   	<th width="450">部门名称</th>
	   	<th width="450">部门级别</th>
	   	<th width="450">编辑</th>
	   	<th width="450">删除</th>
   	</tr>
</thead>
<tbody>
<s:iterator value="list" var="d">
<tr>
<td align="center"><s:property value="#d.dname" /></td>
<td align="center"><s:property value="#d.dictDdesc.dname" /></td>
<td align="center"><a href="department_edit.action?did=<s:property value="#d.did" />"><img src="<%=basePath %>images/edit.png"/></a></td>
<td align="center"><a href="department_delete.action?did=<s:property value="#d.did" />"><img src="<%=basePath %>images/trash.gif"/></a></td>
</tr>
</s:iterator>
</tbody>
</table>
<br/>


<table border="0" cellspacing="0" cellpadding="0"  width="900px">
<tr>
<td align="right">
   <span>第<s:property value="currPage" />/<s:property value="totalPage" />页</span>
   &nbsp;&nbsp;总共<s:property value="totalCount" />条记录
   &nbsp;&nbsp;每页显示<s:property value="pageSize" />条
   <apan>
   <s:if test="currPage > 1">
       <a href="<%=basePath %>department_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
       <a href="<%=basePath %>department_findAll.action?currPage=<s:property value="currPage-1" />">[上一页]</a>&nbsp;&nbsp;
   </s:if>
   <s:if test="currPage < totalPage">
       <a href="<%=basePath %>department_findAll.action?currPage=<s:property value="currPage+1" />">[下一页]</a>&nbsp;&nbsp;
       <a href="<%=basePath %>department_findAll.action?currPage=<s:property value="totalPage" />">[尾页]</a>&nbsp;&nbsp;
   </s:if>
   </span>
</td>
</tr>
</table>
</body>
</html>
