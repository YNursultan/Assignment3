<%--
  Created by IntelliJ IDEA.
  User: Abylay
  Date: 18.10.2020
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/Sport" method="post">
    <input type="submit" value="Sport">
</form>
<form action="<%=request.getContextPath()%>/Furniture" method="post">
    <input type="submit" value="Furniture">
</form>
<form action="<%=request.getContextPath()%>/Gadgets" method="post">
    <input type="submit" value="Gadgets">
</form>
<form action="<%=request.getContextPath()%>/Clothes" method="post">
    <input type="submit" value="Clothes">
</form>


<form method="get" action="<%=request.getContextPath()%>/Logout"><input type="submit" value="Logout"></form>

</body>
</html>
