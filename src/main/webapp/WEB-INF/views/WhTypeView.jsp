<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color: red; text-align: center">WELCOME TO WH TYPE VIEW PAGE</h3>
<a href="excel?id=${ob.userId}">Excel Export</a> | <a href="pdf?id=${ob.userId}">Pdf Export</a>

<table border="1">
<tr><th style="color: purple;">URID</th><td>${ob.userId}</td></tr>
<tr><th style="color: purple;">UTYPE</th><td>${ob.userType}</td></tr>
<tr><th style="color: purple;">UCODE</th><td>${ob.userCode}</td></tr>
<tr><th style="color: purple;">UEMAIL</th><td>${ob.userEmail}</td></tr>
<tr><th style="color: purple;">UCONTACT</th><td>${ob.userContact}</td></tr>
<tr><th style="color: purple;">UIDTYPE</th><td>${ob.userIdType}</td></tr>
<tr><th style="color: purple;">IFOTHER</th><td>${ob.ifOther}</td></tr>
<tr><th style="color: purple;">IDNUMBER</th><td>${ob.idNumber}</td></tr>

</table>




</body>
</html>