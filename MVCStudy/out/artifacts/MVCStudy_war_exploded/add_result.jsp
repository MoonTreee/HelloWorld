<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/15
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" pageEncoding="GBK" %>
<html>
<head>
  <title>计算器</title>
</head>
<body bgcolor="#7fffd4">
<h1>算术计算器</h1>

  <table>
    <tbody>
    <tr>
      <td>第一个数</td>
      <td>${param.num1}</td>
    </tr>
    <tr>
      <td>第二个数</td>
      <td>${param.num2}</td>
    </tr>

    <tr>
      <td>结果</td>
      <td>${result}</td>
    </tr>
    </tbody>

  </table>

  <button onclick="history.go(-1);">返回</button>

</body>
</html>
