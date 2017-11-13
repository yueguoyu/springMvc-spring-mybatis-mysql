<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>
<%--@elvariable id="test" type="com.ygy.model.Test"--%>
<mvc:form modelAttribute="test" method="post" action="login">
    <table>
        <tr><h3>登录</h3></tr>
        <tr>
            <td><mvc:label path="name">name</mvc:label></td>
            <td><mvc:input path="name"/>
            </td>
        </tr>
        <tr>
            <td><mvc:label path="password">password</mvc:label></td>
            <td><mvc:input  path="password"/>
            </td>
        </tr>
    </table>
    <input type="submit" value="go">
</mvc:form>
</body>
</html>
