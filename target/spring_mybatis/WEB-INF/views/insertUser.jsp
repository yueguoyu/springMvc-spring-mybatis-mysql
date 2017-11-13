<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ygy
  Date: 17-11-12
  Time: 下午1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="test" type="com.ygy.model.Test"--%>
<mvc:form action="insertUser" method="post" modelAttribute="test">
    <table>
        <tr>
            <td><mvc:label path="id">id</mvc:label></td>
            <td><mvc:input path="id"/></td>
        </tr>
        <tr>
            <td><mvc:label path="name">name</mvc:label></td>
            <td><mvc:input path="name"/></td>
        </tr>
        <tr>
            <td><mvc:label path="emil">emil</mvc:label></td>
            <td><mvc:input path="emil"/></td>
        </tr>
    </table>
    <input type="submit" value="go">
</mvc:form>
</body>
</html>
