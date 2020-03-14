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
				<h3>WELCOME TO UOM TYPE VIEW PAGE</h3>
			</div>
<div class="card-body">
<a href="excel?id=${um.uomId}"><img src="../resources/images/excel.png" width="30" height="40" /> </a>
<a href="pdf?id=${um.uomId}"><img src="../resources/images/pdf.png" width="30" height="40" /></a>
<table class="table table-hover">
<tr><th>ID</th><td>${um.uomId}</td></tr>
<tr><th>TYPE</th><td>${um.umType}</td></tr>
<tr><th>MODEL</th><td>${um.uomModel}</td></tr>
<tr><th>DESCRIPTION</th><td>${um.uomDesc}</td></tr>
</tr>
</table>
</div>
</div>
</div>
</body>
</html>
