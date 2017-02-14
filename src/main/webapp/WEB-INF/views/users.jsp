<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <div>
        <h2>User List</h2>
        <table class="table table-striped">
            <tr>
                <th>Id</th>
                <th>First name</th>
                <th>Last name</th>
                <th>Username</th>
                <th>Password</th>
                <th>Type</th>
                <th>Category</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach items="${users}" var="user">
            <tr>
                <td><a href="/user/${user.id}">${user.id}</a></td>
                <td>${user.firstName}</td>
               	<td>${user.lastName}</td>
               	<td>${user.userName}</td>
               	<td>${user.userPassword}</td>
               	<td>${user.type}</td>
               	<td>${user.userCategory.name}</td>
                <td><a href="/user/edit/${user.id}">Edit</a></td>
                <td><a href="/user/delete/${user.id}">Delete</a></td> 
            </tr>
			</c:forEach>
        </table>

    </div>
</div>
</body>
</html>