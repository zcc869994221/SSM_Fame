<%--
  Created by IntelliJ IDEA.
  User: Zhy
  Date: 2020/3/7
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>用户登录</h3>
<form method="post" action="AdminLogin">
    <p>
        用户名:<input type="text" name="username">${false}
    </p>
    <p>
        密码:<input type="password" name="password">
    </p>
    <p>
        提交:<input type="submit" value="登录">
    </p>
</form>
</body>
</html>
