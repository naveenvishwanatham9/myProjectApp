<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<h3 style="text-align: center;color: red;">WELCOME TO UOM TYPE REGISTER PAGE </h3>
<form action="save" method="post">
<pre>
<tr><td style="color:purple;"> Uom Type:</td> <td><select name="uomType">
<option>--select--</option>
<option>PACKING</option>
<option>NO PACKING</option>
<option>--NA--</option>
</select></td></tr>

<tr><td style="color:purple;">Uom Model: </td> <td><input type="text" name="uomModel"/></td>

<tr><td style="color:purple;">Description:</td> <td><textarea name="uomDesc" ></textarea></td><br>
<tr><td style="text-align:center;color:green;"><input type="submit" value="CREATE UOM"/></td></tr><td>
</pre>
</form>
</table><br>
${message}
</body>
</html>