<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<h3 style="text-align: 'center';color: 'red'">WELCOME TO ORDER METHOD REGISTER PAGE </h3>

<form:form action="save" method="post"  modelAttribute="orderMethod">

<tr><td style="color:purple;"> Order Mode:</td> <td> <form:radiobutton path="orderMode" value="sale"/>Sale
 <form:radiobutton path="orderMode" value="purchase"/>Purchase
</td></tr>

<tr><td style="color:purple;">Order Code: </td> <td> <form:input path="orderCode" /></td></tr>

<tr><td style="color:purple;">Order Type:</td> <td><form:select path="orderType">
<form:option value="">--select--</form:option>
<form:option value="FIFO">FIFO</form:option>
<form:option value="LIFO">LIFO</form:option>
<form:option value="FCFO">FCFO</form:option>
<form:option value="FEFO">FEFO</form:option>
</form:select> </td><br>
<tr><td>Order Accept:</td> <td><form:checkbox path="orderAccept" value="Multi-Model"/>Multi-Model
<form:checkbox path="orderAccept" value="Accept Return"/>Accept Return</td></tr>
<tr><td>Description:</td><td><form:textarea path="orderDesc"/></td></tr>
<tr><td style="text-align:center;color:green"><input type="submit" value="CREATE"/></td></tr><td>

</form:form>
</table><br>
${message}
</body>
</html>