<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 08.02.2020
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Informujemy, ze ta strona korzysta z plikow Cookies.
<c:choose>
    <c:when test="${cookie.cookieAccept.value=='accept'}">
        Inny tekst.
    </c:when>
    <c:otherwise>
        Informujemy, ze ta strona korzysta z plikow Cookies.
        <a href="localhost:8080/homepage?cookie=accept">Akceptacja plikow Cookies</a>
    </c:otherwise>
</c:choose>
<a href="localhost:8080/receiver?name=coder&email=coder@somemail.com&id=34">dane</a>
</body>
</html>
