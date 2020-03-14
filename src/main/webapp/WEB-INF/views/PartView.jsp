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
				<h3>WELCOME TO PART VIEW PAGE</h3>
			</div>
<div class="card-body">
<a href="excel?pid=${ob.id}"><img src="../resources/images/excel.png" width="30" height="40" /> </a>
<a href="pdf?pid=${ob.id}"><img src="../resources/images/pdf.png" width="30" height="40" /></a>
<table class="table table-hover">
<tr><th>ID</th><td>${ob.id}</td></tr>
<tr><th>CODE</th><td>${ob.partCode}</td></tr>
<tr><th>LENGTH</th><td>${ob.partLen}</td></tr>
<tr><th>WIDTH</th><td>${ob.partWid}</td></tr>
<tr><th>HEIGHT</th><td>${ob.partHgt}</td></tr>
<tr><th>COST</th><td>${ob.baseCost}</td></tr>
<tr><th>CURRENCY</th><td>${ob.baseCurrency}</td></tr>
<tr><th>UOM</th><td>${ob.uomOb.uomModel}</td></tr>
<tr><th>DESCRIPTION</th><td>${ob.note}</td></tr>

</tr>
</table>
</div>
</div>
</div>
</body>
</html>
			