<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <form class="form-horizontal" th:object="${user}" action="/user" method="post">
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
                    <input type="text" class="form-control" name="type"/>
                </div>
            </div>
            <div class="row">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>