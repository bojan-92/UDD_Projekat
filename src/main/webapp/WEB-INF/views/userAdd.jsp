<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
           
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
   
    <h2>Create User</h2>
    <div>
        <form:form class="form-horizontal" action="/user" method="post" modelAttribute="user">
            <div class="form-group">
                <label class="col-sm-2 control-label">First Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="firstName"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Last Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="lastName"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Username:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="userName"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Password:</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" name="userPassword"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Type:</label>
                <div class="col-sm-10">
                    <!-- <input type="text" class="form-control" name="type"/> -->
                   <select name="role">
                   	<option value="">--Select--</option>
            		<option value="administrator">Administrator</option>
					<option value="subscriber">Subscriber</option>
					<option value="visitor">Visitor</option>
     			</select>
                </div>
            </div>
            <select name="category">
            	<c:forEach var="cat" items="${categories}">
            		<option value="${cat.id}">${cat.name }</option>
            	</c:forEach>
            </select>
            <div class="row">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>