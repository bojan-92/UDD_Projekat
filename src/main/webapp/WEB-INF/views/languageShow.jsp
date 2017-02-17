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
    <h2>Language Details</h2>
        <div>
            <form class="form-horizontal">
                <div class="form-group">
                    <div class="col-sm-10">
                        <p class="form-control-static" th:text="${language.id}">Language Id: ${language.id}</p>
                        </div>
                </div>
                <div class="form-group">
                    <p class="form-control-static" th:text="${language.name}">Name: ${language.name}</p></div>
                </div>
            </form>
    </div>
</div>
</body>
</html>