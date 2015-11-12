<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.jumbotron {
    position: relative;
    background: #000 url("https://assets.vg247.com/current//2015/03/rory_pga_tour_sceen_1.jpg") center center;
    width: 100%;
    height: 100%;
    background-size: cover;
    overflow: hidden;
}
body {
   background:tan !important;
}
table {
	background:lightgrey  !important;
}
h1 {
	border:10;
	bordercolor:grey;
	background:lightgrey;
	width:200px;
}
</style>
<title>Buy Your Dream Bag Here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
	crossorigin="anonymous">
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css"
integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX"
crossorigin="anonymous">

</head>

<body>
<div class="jumbotron">
<h1>Golf World</h1>
</div>
<div class="container">
<h3>Click Your Product Name and Save</h3>
</div>

<br>
<br>
<div class="container">
<table class="table table-hover" border="10" bordercolor="grey" >
<tr>
<th><b>Product Name</b></th>
<th><b>Product Description</b></th>
<th>Price</th>
<th>Product ID</th>
</tr>
<c:forEach var="product" items="${productList}">

<tr>
<td><b><a href= "ItemSelectServlet?productId=${product.productId}">${product.productName}</a></b></td>
<td>${product.description}</td>
<td>${product.price}</td>
<td>${product.productId}</td>
</tr>
</c:forEach>


</table>
</div>






 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"
		integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ=="
		crossorigin="anonymous"></script>
</body>
</html>