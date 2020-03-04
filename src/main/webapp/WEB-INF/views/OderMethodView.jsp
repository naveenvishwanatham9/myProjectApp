<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color: red; text-align: center">WELCOME TO ORDER METHOD VIEW PAGE</h3>
<a href="excel"><img alt="" src="../resources/images/excel.png" height="30" weight="50"></a>| <a href="pdf"><img alt="" src="../resources/images/pdf.png" height="30" weight="50"></a>
<table border="1">
<tr><th style="color: purple;">ID</th><td>${ob.orderId}</td></tr>
<tr><th style="color: purple;">MODE</th><td>${ob.orderMode}</td></tr>
<tr><th style="color: purple;">CODE</th><td>${ob.orderCode}</td></tr>
<tr><th style="color: purple;">TYPE</th><td>${ob.orderType}</td></tr>
<tr><th style="color: purple;">ACCEPT</th><td>${ob.orderAccept}</td></tr>
<tr><th style="color: purple;">DESCRIPTION</th><td>${ob.orderDesc}</td></tr>
</table>
</body>
</html>