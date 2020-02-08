<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 08.02.2020
  Time: 09:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${smurfs}" var="smurf">
    <tr>
        <td>${smurf.name}, ${smurf.attribute}, ${smurf.description}</td><br>
    </tr>
</c:forEach>
<a href="localhost:8080/receiver?name=coder&email=coder@somemail.com&id=34">dane</a>
</body>
</html>
