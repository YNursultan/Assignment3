<%@ page import="java.util.Map" %>
<%@ page import="Item.Product" %>
<%@ page import="java.util.LinkedList" %><%--
  Created by IntelliJ IDEA.
  User: Abylay
  Date: 18.10.2020
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    LinkedList<Product> list = (LinkedList<Product>) request.getAttribute("list");
%>

<form action="Show" method="post">
    <% for (int a = 0; a < list.size(); a++){%>
    <input type="checkbox" name="items" id="chk1" value="<%=list.get(a).getName()%>">
    <label for="chk1"><%=list.get(a).getName() + " " + list.get(a).getCost()%></label>

    <%}%>
    <input type="submit" value="Buy">
</form>

</body>
</html>