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
<tr><h3 style="text-align: center;color: red;">WELCOME TO SHIPMENT TYPE EDIT PAGE </h3></tr>
<form:form action="update" method="post" modelAttribute="ShipmentType">
<pre>
<tr> <td> Shipment Id:</td> <td><form:input path="shipId" readonly="true"/>  </td> </tr>
<tr><td> Shipment mode:</td> <td> <form:select path="shipMode">
<form:option value="">--select--</form:option>
<form:option value="Air">Air</form:option>
<form:option value="Truck">Truck</form:option>
<form:option value="Ship">Ship</form:option>
<form:option value="Train">Train</form:option>
</form:select> </td></tr>
<tr><td>Shipment Code: </td> <td><form:input type="text" path="shipCode"/></td>
<tr><td>Enable Shipment:</td> <td> <form:select path="enbShip">
<form:option value="">--select--</form:option>
<form:option value="Yes">Yes</form:option>
<form:option value="No">No</form:option>
</form:select></td>
</tr>
<tr><td>Shipment Grade:</td> <td> 
<form:radiobutton path="shipGrad" value="A"/>A &nbsp;
<form:radiobutton path="shipGrad" value="B"/>B &nbsp;
<form:radiobutton path="shipGrad" value="C"/>C </td> </tr>

<tr><td>Description:</td> <td><form:textarea path="shipDesc" ></form:textarea></td><br>
<tr><td style="text-align:center"><input type="submit" value="CREATE SHIPMENT"/></td></tr><td>
</pre>
</form:form>
</table>
${message}
</body>
</html>