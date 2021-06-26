<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="./base.jsp" %>
</head>
<body>
<h1>Products List</h1>
    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>description</th>
             <th>price</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="list" items="${product}">
            <tr>
                <td>${list.id}</td>
                <td>${list.name}</td>
                <td>${list.description}</td>
                 <td>${list.price}</td>
                <td><a href="update/${list.id}">Update</a></td>
                <td><a href="delete/${list.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
<br/>
<a href="addproduct">add</a>

</body>
</html>