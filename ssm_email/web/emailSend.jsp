<%--
  Created by IntelliJ IDEA.
  User: SXT
  Date: 2019/8/27
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发送邮件页面</title>
</head>
<body>

<h3>邮件发送页面</h3>

<form action="email/sendEmail" method="post" enctype="multipart/form-data">

    <p>
        收件人：<input type="text" name="recid"/>

    </p>

    <p>
        主题：<input type="text" name="etitle"/>

    </p>

    <p>
        正文：<input type="text" name="ecno"/>

    </p>

    <p>
        附件：<input type="file" name="fi"/>

    </p>
    <p>
           <input type="submit" value="发送"/>

    </p>



</form>


</body>
</html>
