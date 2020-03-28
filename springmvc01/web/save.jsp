<%--
  Created by IntelliJ IDEA.
  User: SXT
  Date: 2019/8/23
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>

<h3>用户注册</h3>

<h3>用户的添加</h3>
<%--
    用二进制流传
        enctype="multipart/form-data"
--%>
<form action="fileUpload" method="post" enctype="multipart/form-data">

    <p>
        用户名：<input type="text" name="uname"/>
    </p>
    <p>
        密码：<input type="text" name="pwd"/>
    </p>
    <p>
        年龄：<input type="text" name="age"/>
    </p>
    <p>
        出生日期：<input type="text" name="birth"/>
    </p>
    <p>
        爱好：

        吃：<input type="checkbox" name="hobby" value="chi"/>

        喝：<input type="checkbox" name="hobby" value="he"/>

        玩：<input type="checkbox" name="hobby" value="wan"/>

    </p>
    <p>
        文件<input type="file" value="fi"/>
    </p>
    <p>
        <input type="submit" value="提交"/>
    </p>


</form>


<a href="demo5/zs/123">删除</a>

</body>
</html>
