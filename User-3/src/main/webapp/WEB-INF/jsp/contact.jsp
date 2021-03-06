<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" 
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
    crossorigin="anonymous">

    <title>Form</title>
  </head>
  <body>
  <div class="container" align="center">
  <h3>${welcome}</h3>
  
  <form action="processform" method="post">
  
  <div class="form-row">
      <label for="validationCustom01">First name</label>
      <input 
      type="text" 
      name="fname" 
      class="form-control" 
      id="validationCustom01" 
      placeholder="First name" 
       required>
      <div class="valid-feedback">
        Looks good!
      </div>
      <label for="validationCustom02">Last name</label>
      <input type="text" name="lname" class="form-control" id="validationCustom02" placeholder="Last name"  required>
      <div class="valid-feedback">
        Looks good!
      </div>
  </div>
  <div class="form-row">
      <label for="validationCustom03">City</label>
      <input type="text" name="city" class="form-control" id="validationCustom03" placeholder="City" required>
      <div class="invalid-feedback">
        Please provide a valid city.
      </div>
  </div>
  <br>
  <button class="btn btn-success" type="submit">Submit form</button>
</form>

</div>

<hr>
<c:forEach var="list" items="${students}">
<tr><td>${list.id}</td>
<td>${list.fname}</td>
<td>${list.lname}</td>
<td>${list.city}</td><br></tr>
</c:forEach>

  
      <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>