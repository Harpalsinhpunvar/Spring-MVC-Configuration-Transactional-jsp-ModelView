<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" 
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
    crossorigin="anonymous">
</head>
<body>
<div class="container" align="center">

<form action="/update/${id}" method="post">
  
  <div class="form-row">
      
      <label for="validationCustom01">Student Name</label>
      <input 
      type="text" 
      name="studentName" 
      class="form-control" 
      id="validationCustom01"  
       required>
      <div class="valid-feedback">
        Looks good!
      </div>
     
      <label for="validationCustom02">Student Email</label>
      
      <input 
      type="email" 
      name="studentEmail" 
      class="form-control" 
      id="validationCustom02"  
      required>
      <div class="valid-feedback">
        Looks good!
      </div>  
  </div>
  <br>
  <button class="btn btn-success" type="submit">Submit form</button>
</form>
</div>

</body>
</html>