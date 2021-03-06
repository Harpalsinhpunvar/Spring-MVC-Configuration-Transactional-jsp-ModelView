<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<title>ADD Products</title>
</head>
<body>

<div class="container" align="center">

<h1>Add Products</h1>

<form action="handle-product" method="post">
  <div class="form-group">
    <label for="name">Product Name</label>
    <input type="text" name="name" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Product Name">
  </div>
  <div class="form-group">
    <label for="description">Product Description</label>
    <input type="text" name="description" class="form-control" id="description" placeholder="Product Description">
  </div>
    <div class="form-group">
    <label for="price">Product Price</label>
    <input type="text" name="price" class="form-control" id="price" placeholder="Product Price">
  </div>
  <br>
  <div align="center">
  <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
  <button type="submit" class="btn btn-success">Submit</button></div>
</form>
</div>

</body>
</html>