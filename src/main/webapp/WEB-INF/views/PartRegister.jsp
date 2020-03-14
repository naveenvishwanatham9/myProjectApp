<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="UserMenu.jsp" %>
<div class="container">
<div class="card">
<div class="card-header bg-primary text-center text-white text-uppercase">
<h3>WELCOME TO PART REGISTER PAGE</h3>
</div>
<div class="card-body">
<form:form action="save" method="post" modelAttribute="part">
<div class="row">
<div class="col-4">
<label for="partCode"> PART CODE</label>
</div>
<div class="col-4">
<form:input path="partCode" class="form-controller"/>
</div>
<div class="col-4">
<!-- Error Message -->
</div>
</div>

<div class="row">
<div class="col-4">
<label for="partLen"> PART LENGTH</label>
</div>
<div class="col-4">
<form:input path="partLen" class="form-controller"/>
</div>
<div class="col-4">
<!-- Error Message -->
</div>
</div>

<div class="row">
<div class="col-4">
<label for="partWid"> PART WIDTH</label>
</div>
<div class="col-4">
<form:input path="partWid" class="form-controller"/>
</div>
<div class="col-4">
<!-- Error Message -->
</div>
</div>

<div class="row">
<div class="col-4">
<label for="partHgt"> PART HEIGHT</label>
</div>
<div class="col-4">
<form:input path="partHgt" class="form-controller"/>
</div>
<div class="col-4">
<!-- Error Message -->
</div>
</div>

<div class="row">
<div class="col-4">
<label for="baseCost"> BASE COST</label>
</div>
<div class="col-4">
<form:input path="baseCost" class="form-controller"/>
</div>
<div class="col-4">
<!-- Error Message -->
</div>
</div>
<div class="row">
<div class="col-4">
<label for="baseCurrency"> BASE CURRENCY</label>
</div>
<div class="col-4">
<form:select path="baseCurrency" class="form-control">
<form:option value="">--select--</form:option>
<form:option value="INR">INR</form:option>
<form:option value="USD">USD</form:option>
<form:option value="AUS">AUS</form:option>
<form:option value="ERU">ERU</form:option>
</form:select>
</div>
<div class="col-4">
<!-- Error Message -->
</div>
</div>

<div class="row">
<div class="col-4">
<label for="uomOb"> UOM</label>
</div>
<div class="col-4">
<form:select path="uomOb.uomId" class="form-control">
<form:option value="">--select--</form:option>
<form:options items="${uomMap}"/>
</form:select>

</div>
<div class="col-4">
<!-- Error Message -->
</div>
</div>
<div class="row">
<div class="col-4">
<label for="omSaleOb"> ORDERMETHOD CODE</label>
</div>
 <div class="col-4">
<form:select path="omSaleOb.orderId" class="form-control">
<form:option value="">--select--</form:option>
<form:options items="${omSaleMap}"/>
</form:select>
<br>
 
<form:select path="omPurchaseOb.orderId" class="form-control">
<form:option value="">--select--</form:option>
<form:options items="${omPurchaseMap}"/>
</form:select>

</div>
<div class="col-4">
<!-- Error Message -->
</div>
</div>


<div class="row">
<div class="col-4">
<label for="note"> DESCRIPTION</label>
</div>
<div class="col-4">
<form:textarea path="note" class="form-controller"/>
</div>
<div class="col-4">
<!-- Error Message -->
</div>
</div>

<div class="row">
<div class="col-4"></div>
<div class="col-4">
<input type="submit" value="Create" class="btn btn-success" />
<input type="reset" value="Clear" class="btn btn-danger" />
</div>
</div>
</form:form>
</div>

<c:if test="${!empty message }">
<div class="card-footer bg-info text-white text-center">
<b>${message} </b>
</div>
</c:if>
</div>
</div>
</body>
</html>