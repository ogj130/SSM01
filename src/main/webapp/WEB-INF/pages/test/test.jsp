<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ouguangji
  Date: 2020/3/2
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
this is ssm project
<form action="findUser.action" method="post">
    用户姓名:<input type="text" name="yhname"/>
    </br>
    <input type="submit" value="查询">
</form>
<table width="300px;" border="1px">
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>账号</td>
        <td>电话</td>
    </tr>
    <c:forEach items="${userList}" var="user" varStatus="status">
        <tr>
            <td>${status.index+1}</td>
            <td>${user.yhname}</td>
            <td>${user.username}</td>
            <td>${user.yhphone}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
