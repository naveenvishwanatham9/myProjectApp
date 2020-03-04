<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color: red; text-align: center">WELCOME TO SHIPMENT TYPE VIEW PAGE</h3>
<a href="excel?id=${ob.shipId}">Excel Export</a> | <a href="pdf?id=${ob.shipId}">Pdf Export</a>

<table border="1">
<tr><th style="color: purple;">ID</th><td>${ob.shipId}</td></tr>
<tr><th style="color: purple;">MODE</th><td>${ob.shipMode}</td></tr>
<tr><th style="color: purple;">CODE</th><td>${ob.shipCode}</td></tr>
<tr><th style="color: purple;">ENABLE</th><td>${ob.enbShip}</td></tr>
<tr><th style="color: purple;">GRADE</th><td>${ob.shipGrad}</td></tr>
<tr><th style="color: purple;">NOTE</th><td>${ob.shipDesc}</td></tr>
</table>




</body>
</html>