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
<h3 style="text-align:center;color:red">WELCOME TO ORDER METHOD RECORDS PAGE</h3>
<a href="excel"><img alt="" src="../resources/images/excel.png" height="30" weight="50"></a>| <a href="pdf"><img alt="" src="../resources/images/pdf.png" height="30" weight="50"></a>
<c:choose>
<c:when test="${!empty list}">
<table border="1">
<tr style="color:orange;"><th>ID</th>
<th>MODE</th>
<th>CODE</th>
<th>TYPE</th>
<th>ACCEPT</th>
<th>NOTE</th>
<th colspan="3">OPERATIONS</th>

</tr>
<c:forEach items="${list}" var="ob">
<tr><td>${ob.orderId}</td>
<td>${ob.orderMode}</td>
<td>${ob.orderCode}</td>
<td>${ob.orderType}</td>
<td>${ob.orderAccept}</td>
<td>${ob.orderDesc}</td>
<td><a href=delete?oid=${ob.orderId}> <img alt="" src="../resources/images/delete.png" height="30" weight="50"> </a></td>
<td><a href=edit?oid=${ob.orderId}><img alt="" src="../resources/images/edit1.png" height="30" weight="50"></a></td>
<td><a href=view?oid=${ob.orderId}><img alt="" src="../resources/images/view.png" height="30" weight="50"></a></td>

</c:forEach>
</table>
</c:when>
</c:choose>
</body>
</html>