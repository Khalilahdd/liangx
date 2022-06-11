<%--
  Created by IntelliJ IDEA.
  User: Khalilah
  Date: 2021/10/31
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>员工列表</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <%--    web路径
        不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题
        以/开始的相对路径，找资源，以服务器的路径为标准 （http://localhost:3306）
    --%>
    <script type="text/javascript" src="${APP_PATH }/static/script/jquery-1.7.2.js"></script>
    <%--引入 Bootstrap，美化界面--%>
    <link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script href="http://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" rel="stylesheet"></script>
</head>
<body>
<%--搭建显示页面--%>
<div class="container">
    <%--标题--%>
    <div class="row"></div>
    <div class="col-md-12">
        <h1>SSM-CRUD</h1>
    </div>
    <%--    按钮--%>
    <div class="row"></div>
    <div class="col-md-4 col-md-offset-8">
        <button class="btn btn-primary">新增</button>
        <button class="btn btn-danger">删除</button>
    </div>
    <%--    显示表格数据--%>
    <div class="row"></div>
    <div class="col-md-12">
        <table class="table table-hover">
            <tr>
                <th>#</th>
                <th>empName</th>
                <th>gender</th>
                <th>email</th>
                <th>deptName</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${pageInfo.list}" var="emps">
                <tr>
                    <th>${emp.empId}</th>
                    <th>${emp.empName}</th>
                    <th>${emp.gender=="M"?"男":"女"}</th>
                    <th>${emp.email}</th>
                    <th>${emp.department.deptName}</th>
                    <th>
                        <button class="btn btn-primary btn-sm">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                            编辑
                        </button>
                        <button class="btn btn-danger btn-sm">
                            <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                            删除
                        </button>
                    </th>
                </tr>
            </c:forEach>
        </table>
    </div>
    <%--    显示分页信息--%>
    <div class="row">
        <%--        分页文字信息--%>
        <div class="col-md-6">
            当前${pageInfo.pageNum}页,总${pageInfo.pages} 页,总${pageInfo.total} 条记录
        </div>
        <%--    分页条信息--%>
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li>
                        <a href="${APP_PATH }/emps?pn=1}">首页</a>
                    </li>
                    <c:if test="${pageInfo.hasPreviousPage }">
                        <li>
                            <a href="${APP_PATH }/emps?pn=${pageInfo.pageNum - 1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${pageNum == pageInfo.pageNum }">
                            <li class="active"><a href="#">${page_Num}</a></li>
                        </c:if>
                        <c:if test="${pageNum != pageInfo.pageNum }">
                            <li><a href="${APP_PATH }/emps?pn=page_Num">${page_Num}</a></li>
                        </c:if>
                    </c:forEach>
                    <li>
                        <a href="${APP_PATH }/emps?pn=${pageInfo.pages}">末页</a>
                    </li>
                    <c:if test="${pageInfo.hasNextPage+1 }">
                        <li>
                            <a href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>

                </ul>
            </nav>
        </div>
    </div>
</div>

<script type="text/javascript">
    //1、页面加载完成以后，直接去发送Ajax请求，要到分页数据
    $(function () {
        $.ajax({
            url: "${APP_PATH }/emps",
            data: "pn=1",
            type: "GET",
            success: function (result) {
                console.log(result);
            }
        });
    });
</script>
</body>
</html>
