<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Orders</title>
</head>
<body>
<h2 style="color: green;">Hi ${adminEmailId}</h2>
<h3 align="center" style="color:red">Pending Orders</h3><br>
<div align="center">
<table align="center" border="1" width="100%">
<tr>
<th>Order Id</th><th>User EmailId</th><th>User Name</th><th>User Contact Number</th><th>User Address</th>
<th>Food Id</th><th>Food Name</th><th>Food Price</th><th>Food Category</th><th>Area</th><th>Order Status</th>
</tr>
<c:forEach items="${list}" var="i">
<tr>
<td>${i.orderId}</td><td>${i.userEntity.userEmailId}</td><td>${i.userEntity.userName}</td>
<td>${i.userEntity.userContactNumber}</td><td>${i.userEntity.userAddress}</td>
<td>${i.foodEntity.foodId}</td><td>${i.foodEntity.foodName}</td><td>${i.foodEntity.foodPrice}</td>
<td>${i.foodEntity.foodCategory}</td><td>${i.area}</td>
<td>${i.orderStatus}</td>
<td><a href="http://localhost:6251/fooditem/admin/orderstatus/${i.orderId}">Delivered</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>