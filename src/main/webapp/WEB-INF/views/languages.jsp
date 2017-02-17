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
        <h2>Language List</h2>
        <table class="table table-striped">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach items="${languages}" var="language">
            <tr>
                <td><a href="/language/${language.id}">${language.id}</a></td>
                <td>${language.name}</td>
                <td><a href="/user/edit/${user.id}">Edit</a></td>
                <td><a href="/user/delete/${user.id}">Delete</a></td> 
            </tr>
			</c:forEach>
        </table>
    </div>
</div>
</body>
</html>