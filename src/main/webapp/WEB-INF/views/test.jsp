<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ygy
  Date: 17-11-11
  Time: 下午7:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--@elvariable id="log" type="com.ygy.model.Log"--%>
    <mvc:form method="post" action="log/select" modelAttribute="log">
        <mvc:label path="time">time</mvc:label>
        <mvc:input path="time"/>
        <br/>
        <input type="submit" value="go">
    </mvc:form>
</body>
</html>
