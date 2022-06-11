<%@ page import="com.atguigu.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/5/14
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Person person = new Person();
        person.setName("迪丽热巴");
        person.setPhones(new String[]{"1008611","1000010","1001011"});

        List<String> cities = new ArrayList<String>();
        cities.add("北京");
        cities.add("上海");
        cities.add("深圳");
        person.setCities(cities);

        Map<String,Object> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        person.setMap(map);

        pageContext.setAttribute("person",person);
    %>

    输出Person:${person} <br/>
    输出Person对象的name属性:${person.name} <br/>
    输出Person对象的phones数组属性值:${person.phones[0]} <br/>
    输出Person对象的cities集合中的元素值:${person.cities} <br/>
    输出Person对象的List集合中个别元素值:${person.cities[2]} <br/>
    输出Person的Map集合:${person.map} <br/>
    输出Person的Map集合中某个key的值:${person.map.key1} <br/>
</body>
</html>
