<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/8/22
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--在WEB-INF下的所以页面或者资源，只能通过controller，或者Servlet进行访问--%>

<h1>登录页面</h1>

<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="提交">
</form>

</body>
</html>
