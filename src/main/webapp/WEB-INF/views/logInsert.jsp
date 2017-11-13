<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ygy
  Date: 17-11-2
  Time: 下午6:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="log" type="com.ygy.model.Log"--%>
<div>
    <h3>添加</h3>
<mvc:form method="post" modelAttribute="log" action="log/insert">
    <table>
        <tr>
            <td><mvc:label path="log">log</mvc:label></td>
            <td><mvc:input path="log"/></td>
        </tr>
        <tr>
            <td><mvc:label path="time">time</mvc:label> </td>
            <td><mvc:input path="time"/></td>
        </tr>
    </table>
    <input type="submit" value="go"/>
</mvc:form>
</div>

</body>
</html>
