<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hello World!</h2>
<%--@elvariable id="user" type="com.ygy.model.Test"--%>
<mvc:form modelAttribute="user" method="post" action="s">
    <table>
        <tr><h3>登录</h3></tr>
        <tr>
            <td><mvc:label path="id">name</mvc:label></td>
            <td><mvc:input path="id"/>
            </td>
        </tr>
    </table>
    <input type="submit" value="go">
</mvc:form>
</body>
</html>
