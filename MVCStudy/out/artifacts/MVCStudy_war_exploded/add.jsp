<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/15
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK"  %>
<html>
  <head>
    <title>计算器</title>
  </head>
  <body bgcolor="#7fffd4">
  <h1>算术计算器</h1>
  <form id = "calcForm" METHOD="post" action="add.action">
    <table>
      <tbody>
      <tr>
        <td>第一个数</td>
        <td><input type="text" name="num1"/></td>
      </tr>
      <tr>
        <td>第二个数</td>
        <td><input type="text" name="num2"/></td>
      </tr>
      <td><input type="submit" value="加"></td>
      </tbody>
    </table>
    </form>

  <form id = "calcForm0" METHOD="post" action="subtract.action">
    <table>
      <tbody>
      <tr>
        <td>第一个数</td>
        <td><input type="text" name="num1"/></td>
      </tr>
      <tr>
        <td>第二个数</td>
        <td><input type="text" name="num2"/></td>
      </tr>
      <td><input type="submit" value="减"></td>
      </tbody>
    </table>
  </form>
  </body>
</html>
