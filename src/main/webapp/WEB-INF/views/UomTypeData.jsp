<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="text-align: center;color: red;">WELCOME TO UOM TYPE DATA PAGE </h3>
<a href="excel"><img alt="" src="../resources/images/excel.png" height="30" weight="50"></a>| <a href="pdf"><img alt="" src="../resources/images/pdf.png" height="30" weight="50"></a>

<c:choose>
<c:when test="${!empty list}">
<table border="1">
<tr><th style="color:purple;">ID</th>
<th style="color:purple;">TYPE</th>
<th style="color:purple;">MODEL</th>
<th style="color:purple;">DESCRIPTION</th>
<th colspan="3" style="color:purple;">OPERATION</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr><td>${ob.uomId}</td>
<td>${ob.uomType}</td>
<td>${ob.uomModel}</td>
<td>${ob.uomDesc}</td>
<td><a href=delete?umid=${ob.uomId}> <img alt="" src="../resources/images/delete.png" height="30" weight="50"></a></td>
<td><a href=edit?umid=${ob.uomId}><img alt="" src="../resources/images/edit1.png" height="30" weight="50"></a></td>
<td><a href=view?umid=${ob.uomId}><img alt="" src="../resources/images/view.png" height="30" weight="50"></a></td>
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
