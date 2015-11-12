<%@ include file="header.jsp" %>

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

<%@ include file="footer.jsp" %>
