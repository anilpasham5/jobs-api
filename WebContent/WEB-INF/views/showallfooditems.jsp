<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Food Items</title>
</head>
<body>
<h2 style="color: green;">Hi ${adminEmailId}</h2>
<h3 align="center" style="color:blue;">All Food Items</h3>
<div align="center">
<table align="center" border="1" width="100%">
<tr>
<th>Food Id</th><th>Food Name</th><th>Food Price</th><th>Food Category</th>
</tr>
<c:forEach items="${list}" var="i">
<tr>
<td>${i.foodId}</td><td>${i.foodName}</td><td>${i.foodPrice}</td>
<td>${i.foodCategory}</td>
<c:forEach items="${i.areas}" var="j">
<td>${j.area}</td><td>${j.availability}</td>
</c:forEach>
<td><a href="">Edit</a></td><td><a href="food/${i.foodId}">Delete</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>