<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<h3 style="text-align: center;color: red;">WELCOME TO WH TYPE REGISTER PAGE </h3>

<form:form action="save" method="post" modelAttribute="whType">

<tr><td style="color:purple"> User Type:</td> <td> <form:radiobutton path="userType" value="vendor" id="vendor"/>Vendor
 <form:radiobutton path="userType" value="customer"/>Customer
</td></tr>

<tr><td style="color:purple;">User Code: </td> <td> <form:input path="userCode" /></td></tr>
<tr><td>User For:</td>


<tr><td style="color:purple;">User Email: </td> <td> <form:input path="userEmail" /></td></tr>
<tr><td style="color:purple;">User Contact: </td> <td> <form:input path="userContact" /></td></tr>

<tr><td style="color:purple;">User IdType:</td> <td><form:select path="userIdType">
<form:option value="">--select--</form:option>
<form:option value="PANCARD">PANCARD</form:option>
<form:option value="AADHAR">AADHAR</form:option>
<form:option value="VOTERID">VOTERID</form:option>
<form:option value="OTHER">OTHER</form:option>
</form:select> </td>

<tr><td style="color:purple;">If Other: </td> <td> <form:input path="ifOther" /></td></tr>
<tr><td style="color:purple;">Id Number: </td> <td> <form:input path="idNumber" /></td></tr>

<tr><td style="text-align:center;color:green;"><input type="submit" value="CREATE USER"/></td></tr><td>

</form:form>
</table><br>
${message}
</body>
</html>