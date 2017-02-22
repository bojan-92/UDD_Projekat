<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="<c:url value="/logout" />">Logout</a>

<div class="container">
    <h2>User Details</h2>
        <div>
            <form class="form-horizontal">
                <div class="form-group">
                    <div class="col-sm-10">
                        <p class="form-control-static" th:text="${user.id}">User Id: ${user.id}</p></div>
                </div>
                <div class="form-group">
                    <p class="form-control-static" th:text="${user.firstName}">First name: ${user.firstName}</p></div>
                </div>
                <div class="form-group">
                    <p class="form-control-static" th:text="${user.lastName}">Last name: ${user.lastName}</p></div>
                </div>
                <div class="form-group">
                    <p class="form-control-static" th:text="${user.userName}">Username: ${user.userName}</p></div>
                </div>
                <div class="form-group">
                    <p class="form-control-static" th:text="${user.userPassword}">Password: ${user.userPassword}</p></div>
                </div>
                <div class="form-group">
                    <p class="form-control-static" th:text="${user.type}">Type: ${user.type}</p></div>
                </div>
            </form>
    </div>
</div>
</body>
</html>