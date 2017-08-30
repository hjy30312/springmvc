<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/30
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

</head>
<body>
    <h2>人员列表</h2>
    <table>
        <tr>
            <td>用户名</td>
            <td>密码</td>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                </tr>
            </c:forEach>
        </tr>
    </table>
</body>
</html>
