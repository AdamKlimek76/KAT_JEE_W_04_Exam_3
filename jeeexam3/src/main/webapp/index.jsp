<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 08.02.2020
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="localhost:8080/receiver?name=coder&email=coder@somemail.com&id=34">dane</a>
<form action="receiver" method="GET">
    <label>
        Name:
        <input type="text" name="name">
    </label>
    <label>
        Email:
        <input type="text" name="email">
    </label>
    <label>
        Id:
        <input type="number" name="id">
    </label>
    <input type="submit">
</form>
</body>
</html>
