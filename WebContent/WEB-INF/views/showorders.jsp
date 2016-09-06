<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your Orders</title>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
<h3>Hi ${userEmailId}</h3>
<h4 align="center" style="color:green">Your Orders</h4><br>
<div align="center" ng-app="myapp" ng-controller="myCtrls">
<table align="center" border="2" width="100%">
<tr>
<th>Order Id</th><th>Food Item</th><th>Food Price</th><th>Food Category</th>
<th>Quantity</th><th>Ordered Date</th><th>Area</th><th>Order Status</th>
</tr>
<c:forEach items="${list}" var="i">
<tr>
<td>${i.orderId}<input name="orderId" ng-model="orderId" type="hidden" id="orderId" value="${i.orderId}"></td>
<td>${i.foodEntity.foodName}</td><td>${i.foodEntity.foodPrice}</td>
<td>${i.foodEntity.foodCategory}</td><td>${i.quantity}</td><td>${i.orderedDate}</td>
<td>${i.area}</td><td><a ng-click="cancelOrder()">Cancel</a></td>
</tr>
</c:forEach>
</table>
</div>

<script type="text/javascript">
var app = angular.module('myapp', []);
app.controller("myCtrls",function($scope,$http){

	$scope.cancelOrder=function(){
		$http({
	   		 method:"delete",
	   		 url:"./order/"+document.getElementById("orderId").value,
	   		 }
	   	     ).then(
	   	   function mySuccess(response){
	   		alert(response.data);
	   	   }		 
	   	 );
	}
});
</script>

</body>
</html>