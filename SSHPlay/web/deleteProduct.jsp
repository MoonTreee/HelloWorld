<%--
  Created by IntelliJ IDEA.
  User: Tree
  Date: 2017/3/5
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>删除商品信息</title>
</head>
<body>
<h1>删除商品的页面</h1>
<s:form action="product_delete" method="POST" namespace="/" theme="simple">
    <table border="1" width="400">
        <tr>
            <td>商品id:目前只支持依照id删除</td>
            <td><s:textfield name="pid"/></td>
        </tr>

    </table>

</s:form>

</body>
</html>