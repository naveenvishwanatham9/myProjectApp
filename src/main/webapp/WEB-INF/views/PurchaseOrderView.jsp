<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
				<h3>WELCOME TO PURCHASE ORDER VIEW PAGE</h3>
			</div>
<div class="card-body">
<a href="excel?id=${ob.partId}"><img src="../resources/images/excel.png" width="30" height="40" /> </a>
<a href="pdf?id=${ob.partId }"><img src="../resources/images/pdf.png" width="30" height="40" /></a>
<table class="table table-hover">
<tr><th>ID</th><td>${ob.partId}</td></tr>
<tr><th>ORDERCODE</th><td>${ob.orderCode}</td></tr>
<tr><th>SHIPCODE</th><td>${ob.shipmentCode}</td></tr>
<tr><th>VENDOR</th><td>${ob.vendor}</td></tr>
<tr><th>NUMBER</th><td>${ob.refNumber}</td></tr>
<tr><th>QCHECK</th><td>${ob.qualityCheck}</td></tr>
<tr><th>DCHECK</th><td>${ob.defaultStatus}</td></tr>
<tr><th>NOTE</th><td>${ob.description}</td></tr>
</tr>
</table>
</div>
</div>
</div>
</body>
</html>