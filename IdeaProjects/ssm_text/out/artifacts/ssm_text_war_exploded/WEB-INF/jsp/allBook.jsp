<%--
  Created by IntelliJ IDEA.
  User: Khalilah
  Date: 2021/11/30
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 —— 显示所有书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/toAddBook">新增</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/allBook">显示全部书籍</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column">
            <%--查询书籍--%>
            <form action="${pageContext.request.contextPath}/queryBook" method="post" style="float:right">
                <span style="color:red; font-weight: bold">${error}</span>
                <input type="text" name="queryBookName" placeholder="请输入要查询的书籍名字">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名字</th>
                    <th>书籍数量</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="book" items="${requestScope.get('list')}">
                    <tr>
                        <td>${book.getBookID()}</td>
                        <td>${book.getBookName()}</td>
                        <td>${book.getNumber()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/toUpdateBook?id=${book.getBookID()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/del/${book.getBookID()}">删除</a> |
                            <a href="${pageContext.request.contextPath}/appoint}">预约</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
