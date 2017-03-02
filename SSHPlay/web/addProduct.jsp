<%--
  Created by IntelliJ IDEA.
  User: Tree
  Date: 2017/2/23
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Insert</title>
</head>
<body>
<h1>保存商品的页面</h1>
<s:form action="product_save" method="POST" namespace="/" theme="simple">
    <table border="1" width="400">
        <tr>
            <td>商品名称</td>
            <td><s:textfield name="pname"/></td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td><s:textfield name="price"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="添加"></td>
        </tr>

    </table>

</s:form>

</body>
</html>
