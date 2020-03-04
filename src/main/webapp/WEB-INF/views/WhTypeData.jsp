<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO WHTYPE DATA PAGE</h3>
<c:choose>
<c:when test="${!empty list}">
<table border="1">
<tr><td>URID</td>
<th>UTYPE</th>
<th>UCODE</th>
<th>UEMAIL</th>
<th>UCONTACT</th>
<th>UIDTYPE</th>
<th>IFOTHER</th>
<th>IDNUMBER</th>
<th colspan="3">OPERATIONS</th>
</tr>
<c:forEach items="${list}" var="ob">

<tr><td>${ob.userId}</td>
<td>${ob.userType}</td>
<td>${ob.userCode}</td>
<td>${ob.userEmail}</td>
<td>${ob.userContact}</td>
<td>${ob.userIdType}</td>
<td>${ob.ifOther}</td>
<td>${ob.idNumber}</td>
<td><a href="delete?uid=${ob.userId}">DELETE</a></td>
<td><a href="edit?uid=${ob.userId}">EDIT</a></td>
<td><a href="view?uid=${ob.userId}">VIEW</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h3>NO DATA FOUND!!</h3>
</c:otherwise>
</c:choose>
</body>
</html>