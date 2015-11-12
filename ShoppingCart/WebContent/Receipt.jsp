<%@ include file="header.jsp" %>

<div class="container">
<div class="span4 offset4 text-center">
<h3>Receipt</h3>
</div>
<table class="table table-hover" border="10" bordercolor="grey">
<tr>
<th>Receipt ID</th>
<th>Product Description</th>
<th>Product ID</th>
<th>Product Name</th>

<th>Product Price</th>
</tr>

<tr>
<td>${receipt.receiptId}</td>
<td>${products.description}</td>
<td>${receipt.productId}</td>
<td>${products.productName}</td>

<td>${products.price}</td>


</tr>




</table>
</div>
<div class="container">
<div class="span4 offset4 text-center">
<a class="btn btn-danger btn-lg" href="ProductServlet" role="button">Back to Products</a>
<a class="btn btn-danger btn-lg" href="https://www.google.com/" role="button">Pay</a>
</div>
</div>


<%@ include file="footer.jsp" %>