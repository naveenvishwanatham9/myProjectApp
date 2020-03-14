
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
				<h3>Welcome to Sale Order Register Page</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="post" modelAttribute="saleOrder">

					<div class="row">
						<div class="col-4">
							<label for="orderCode">ORDER CODE</label>
						</div>
						<div class="col-4">
							<form:input path="orderCode" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error message -->
						</div>
					</div>
					
					<div class="row">
						<div class="col-4">
							<label for="shipmentCode">SHIPMENT CODE</label>
						</div>
						<div class="col-4">
							<form:select path="shipmentCode.shipId" class="form-control">
								<form:option value="">--select--</form:option>
								<form:options items="${shipmentMap}" />
								</form:select>
						</div>
						<div class="col-4">
							<!-- Error message -->
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="customer">CUSTOMER</label>
						</div>
						<div class="col-4">
							<form:select path="customer.userId" class="form-control">
								<form:option value="">--select--</form:option>
								<form:options items="${whMap}" />
								</form:select>
						</div>
						<div class="col-4">
							<!-- Error message -->
						</div>
					</div>
				
				
				
					<div class="row">
						<div class="col-4">
							<label for="refNumber">REFERENCE NUMBER</label>
						</div>
						<div class="col-4">
							<form:input path="refNumber" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error message -->
						</div>
					</div>
					
					
					<div class="row">
						<div class="col-4">
							<label for="stockMode">STOCKMODE</label> 
						</div>
						<div class="col-4">
							<form:radiobutton path="stockMode" value="GRADE" />
							GRADE
							<form:radiobutton path="stockMode" value="MARGIN" />
							MARGIN
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>
					<div class="row">
					<div class="clo-4">
					<label for="stockSource"> STOCK SOURCE</label>
					</div>
					<div class="col-4">
					<form:select path="stockSource">
					<form:option value="">--select--</form:option>
					<form:option value="OPEN">OPEN</form:option>
					<form:option value="AVAIL">AVAIL</form:option>
					<form:option value="REFUND">REFUND</form:option>
					
					</form:select></div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="defaultStatus">DEFAULT STATUS</label>
						</div>
						<div class="col-4">
							<form:input path="defaultStatus" class="form-control" />
							</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="shipDesc">DESCRIPTION</label>
						</div>
						<div class="col-4">
							<form:textarea path="description" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>
					<div class="row">
						<div class="col-4"></div>
						<div class="col-4">
							<input type="submit" value="Create" class="btn btn-success" /> <input
								type="reset" value="Clear" class="btn btn-danger" />
						</div>
					</div>
				</form:form>
			</div>
			<c:if test="${!empty message }">
				<div class="card-footer bg-info text-white text-center">
					<b>${message}</b>
				</div>
			</c:if>
		</div>
		<!-- card end -->
	</div>
	<!-- container end -->
	</body>
</html>