<%--
  Created by IntelliJ IDEA.
  User: ZhangHaoyu
  Date: 2020/3/17
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px">
        <tr>
            <th>花卉编号</th>
            <th>花卉名称</th>
            <th>花卉价格</th>
            <th>花卉产地</th>
        </tr>
        <c:forEach items="${list}" var="flower">
            <tr>
                <td>${flower.id}</td>
                <td>${flower.name}</td>
                <td>${flower.price}</td>
                <td>${flower.production}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
