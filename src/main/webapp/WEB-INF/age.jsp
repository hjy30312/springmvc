<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/1
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <h2>年龄计算器</h2>

    <form action="/age.do" method="post">
        请输入生日：<input type="text" name="birth">
        <input type="submit" value="开始计算">
    </form>
    ${msg}
</body>
</html>
