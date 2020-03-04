<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<h3 style="text-align: center;color: red;">WELCOME TO UOM TYPE REGISTER PAGE </h3>
<form:form action="update" method="post" modelAttribute="uomType">
<pre>
<tr> <td style="color:purple;">Uom Id:</td> <td><form:input path="uomId" readonly="true"/></td></tr>

<tr><td style="color:purple;"> Uom Type:</td> <td><form:select path="uomType">
<form:option value="">--select--</form:option>
<form:option value="PACKING">PACKING</form:option>
<form:option value="NO PACKING">NO PACKING</form:option>
<form:option value="NA">--NA--</form:option>
</form:select></td></tr>

<tr><td style="color:purple;">Uom Model: </td> <td><form:input type="text" path="uomModel"/></td>

<tr><td style="color:purple;">Description:</td> <td><form:textarea path="uomDesc" ></form:textarea></td><br>
<tr><td style="text-align:center"><input type="submit" value="CREATE UOM"/></td></tr><td>
</pre>
</form:form>
</table><br>
${message}
</body>
</html>