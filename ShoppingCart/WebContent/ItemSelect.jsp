<%@ include file="header.jsp" %>

<div class="container">
<h2>********Are You Sure You Would Like to Add This Item to Your Shopping Cart?********</h2>
</div>
<div class="container">
<table class="table table-hover" border="10" bordercolor="grey">
<tr>
<th>Product ID</th>
<th>Product Name</th>
<th>Product Description</th>
<th>Product Price</th>
</tr>

<tr>


<td>${products.productId}</td>
<td>${products.productName}</td>
<td>${products.description}</td>
<td>${products.price}</td>
</tr>



</table>
</div>
<div class="row-fluid">
<div class="span4 offset4 text-center">
<a class="btn btn-danger btn-lg" href="ProductServlet" role="button">Back</a>
<a class="btn btn-success btn-lg" href="ReceiptServlet?pid=${products.productId}" role="button">Add To Cart</a>
</div>
</div>



<%@ include file="footer.jsp" %>