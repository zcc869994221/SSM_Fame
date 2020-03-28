<%--
  Created by IntelliJ IDEA.
  User: SXT
  Date: 2019/8/27
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
</head>
<body>

<h3>登陆页面</h3>
<form action="user/login" method="post">

    <p>
        用户名:<input type="text" name="uname"/>${msg}
    </p>
    <p>
        密码:<input type="text" name="pwd"/>
    </p>
    <p>
        <input type="submit" value="提交"/>
    </p>


</form>

</body>
</html>
