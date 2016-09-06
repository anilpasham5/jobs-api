<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Food Items</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
</head>
<body>
<h1 align="center" style="color: black;">Availble Items in ${area}</h1><br>
<div align="center">
<form action="./order" method="post" onsubmit="return validate()">
<table align="center">
<tr>
<th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>&nbsp;&nbsp;&nbsp;Food Item</th><th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>Food Price</th><th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>Food Category</th><th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>Quantity</th><th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
</tr><tr><td><br></td></tr>
<c:forEach var="i" items="${foodItems}">
<tr>
<td><input type="checkbox" name="items" id="items" value="${i.foodId}"></td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;${i.foodName}</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td>${i.foodPrice}</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td>${i.foodCategory}</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><select name="quantity">
<option>1</option><option>2</option><option>3</option><option>4</option><option>5</option>
<option>6</option><option>7</option><option>8</option><option>9</option><option>10</option>
</select></td>
</tr>
</c:forEach>
</table>
<input type="hidden" value="${area}" name="area">
<div align="center">
<input type="submit" value="Order">
</div>
</form>
</div>
<script type="text/javascript">
function validate(){
	var items=document.getElementById("items").value;
	if(items==null||items==""||items==undefined) return false;
	else return true;
}
</script>
</body>
</html>