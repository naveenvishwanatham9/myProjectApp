<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="UserMenu.jsp"%>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-center text-white text-uppercase">
				<h3>WELCOME TO SHIPMENT TYPE VIEW PAGE</h3>
			</div>
<div class="card-body">
<a href="excel?id=${ob.orderId }"><img src="../resources/images/excel.png" width="30" height="40" /> </a>
<a href="pdf?id=${ob.orderId }"><img src="../resources/images/pdf.png" width="30" height="40" /></a>
<table class="table table-hover">
<tr><th>ID</th><td>${ob.orderId}</td></tr>
<tr><th>MODE</th><td>${ob.orderMode}</td></tr>
<tr><th>CODE</th><td>${ob.orderCode}</td></tr>
<tr><th>TYPE</th><td>${ob.orderType}</td></tr>
<tr><th>ACCEPT</th><td>${ob.orderAccept}</td></tr>
<tr><th>NOTE</th><td>${ob.orderDesc}</td></tr>
</tr>
</table>
</div>
</div>
</div>
</body>
</html>


