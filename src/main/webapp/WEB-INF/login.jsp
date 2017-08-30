<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/29
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page  language="java" pageEncoding="utf-8" %>
<html>
<head>
</head>
<body>
    <h2>用户登录</h2>
    ${msg}
    <form action="/login3.do" method="post">
        username:<input type="text" name = "username" ><p>
        password:<input type="password" name = "password" ><p>
        <input type="submit" value="登录">
    </form>
</body>
</html>
