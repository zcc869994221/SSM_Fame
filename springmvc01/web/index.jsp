<%--
  Created by IntelliJ IDEA.
  User: ZhangHaoyu
  Date: 2020/3/22
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>index.jsp</h1>
  <img src="${pageContext.request.contextPath}/img/1.jpg">

  <%--转发到指定页面中--%>
  <jsp:forward page="WEB-INF/update.jsp"/>
  </body>
</html>
