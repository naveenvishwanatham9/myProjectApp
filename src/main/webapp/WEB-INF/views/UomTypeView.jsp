<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:red;text-align:center">WELCOME TO UOM VIEW PAGE</h3>
<a href="excel?id=${ob.uomId}"><img alt="" src="../resources/images/excel.png" height="30" weight="50"></a> | <a href="pdf?id=${ob.uomId}"><img alt="" src="../resources/images/pdf.png" height="30" weight="50"></a>
<table border="1">
<tr><th style="color:purple;text-align:left;">ID</th><td style="color:fuchsia;">${um.uomId }</td></tr>
<tr><th style="color:purple;text-align:left;">TYPE</th><td style="color:fuchsia;">${um.uomType}</td></tr>
<tr><th style="color:purple;text-align:left;">MODEL</th><td style="color:fuchsia;">${um.uomModel}</td></tr>
<tr><th style="color:purple;text-align:left;">DESCRIPTION</th><td style="color:fuchsia;">${um.uomDesc}</td></tr>

</table>
</body>
</html>