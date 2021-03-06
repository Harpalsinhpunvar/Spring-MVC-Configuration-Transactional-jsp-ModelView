<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>         
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Read Student</h1>
    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="list" items="${students}">
            <tr>
                <td>${list.id}</td>
                <td>${list.studentName}</td>
                <td>${list.studentEmail}</td>
                <td><a href="/update/${list.id}">Update</a></td>
                <td><a href="/delete/${list.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
<br/>
<a href="/index">Create Contact</a>

</body>
</html>