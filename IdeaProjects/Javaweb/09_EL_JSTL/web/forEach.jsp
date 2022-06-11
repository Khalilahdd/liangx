<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="com.atguigu.pojo.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/5/18
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border:1px red solid;
            width: 600px;
            border-collapse: collapse;
        }
        td,th {
            border:1px red solid;
        }
    </style>
</head>
<body>
<%--    1.遍历1到10，输出
            begin属性设置开始的索引
            end 属性设置结束的索引
            var 属性表示循环的变量(也是当前正在遍历到的数据)
            for(int i = 1;i < 10 ;i++)
--%>
    <table border="1">
        <c:forEach begin="1" end="10" var="i">
        <tr>
            <td>第${i}行</td>
        </tr>
        </c:forEach>
    </table>
    <hr>

<%--    2.遍历Object数组
        for(Object:arr)
        items 表示遍历的数据源（遍历的集合）
        var表示当前遍历到的数据
--%>
    <%
        request.setAttribute("arr",new String[]{"1008611","1001011","1000010"});
    %>
    <c:forEach items="${ requestScope.arr }" var="item">
        ${ item } <br>
    </c:forEach>

    <hr>

    <%
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
//        for (Map.Entry<String, Object> entry : map.entrySet()) {
//
//        }
        request.setAttribute("map",map);
    %>
    <c:forEach items="${ requestScope.map}" var="entry">
        <h1>${entry.key}<h1/>
    </c:forEach>
<hr>
<%--            4.遍历list集合---list中存放Student类，有属性：编号，用户名，密码，年龄，电话信息--%>
            <%
                List<Student> studentList = new ArrayList<Student>();
                for(int i = 1; i <= 10; i++) {
                  studentList.add(new Student(i,"username" + i ,"pass"+i,18+i,"phone"+i));
                }
                request.setAttribute("stus",studentList);
            %>
            <table >
                <tr>
                    <th>编号</th>
                    <th>用户名</th>
                    <th>密码</th>
                    <th>年龄</th>
                    <th>电话</th>
                    <th>操作</th>
                </tr>
                <%--
                    items 表示遍历的集合
                    var 表示遍历到的数据
                    begin 表示遍历的开始索引值
                    end 表示结束的索引值
                    step 属性表示遍历的步长值
                    varStatus 属性表示当前遍历到的数据的状态
                --%>
            <c:forEach begin="2" end="8" step="2" varStatus="status" items="${requestScope.stus}" var="stu">
                <tr>
                    <td>${stu.id} </td>
                    <td>${stu.username} </td>
                    <td>${stu.password} </td>
                    <td>${stu.age} </td>
                    <td>${stu.phone} </td>
                    <td>${status.index}</td>
                </tr>

            </c:forEach>
            </table>
</body>
</html>
