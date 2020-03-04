<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color: red">WELCOME TO ORDER METHOD EDIT PAGE</h3>
<table>
<form:form action="update" method="POST" modelAttribute="OrderMethod">
<tr><td style="color: orange">Order Id:</td><td><form:input path="orderId"/></td></tr>
<tr><td style="color: orange">Order Mode:</td><td><form:radiobutton path="orderMode" value="SALE"/>Sale 
<form:radiobutton path="orderMode" value="PURCHASE"/>Purchase </td></tr>
<tr><td style="color: orange">Order Code</td><td><form:input path="orderCode"/></td></tr>
<tr><td style="color: orange">Order Type</td><td><form:select path="orderType">
<form:option value="">--Select--</form:option>
<form:option value="FIFO">FIFO</form:option>
<form:option value="LIFO">LIFO</form:option>
<form:option value="FCFO">FCFO</form:option>
<form:option value="FEFO">FEFO</form:option>
</form:select> </td></tr>
<tr><td style="color: orange">Order Accept:</td><td><form:checkbox path="orderAccept" value="Multi-Model"/>Multi-Model
<form:checkbox path="orderAccept" value="Accept Return"/>Accept Return </td></tr>
<tr><td style="color: orange">Description:</td><td><form:textarea path="orderDesc"/> </td></tr>
<tr><td><input type="submit" value="Create Order Method"> </td></tr>
</form:form>

</table>
</body>
</html>