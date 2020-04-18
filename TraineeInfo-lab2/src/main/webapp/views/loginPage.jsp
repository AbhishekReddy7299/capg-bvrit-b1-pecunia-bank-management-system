<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body style="margin-left: 600px;margin-top: 100px">
    <form action="login" method="post">
    <h2>Login Page</h2>
        <table border="2">
             <tr><td>Username  </td><td><input type="text" name="username"></td></tr>
             <tr><td>Password  </td><td><input type="password" name="password"></td></tr>
             <tr><td><button type="submit">Login</button></td></tr>
        </table>
    </form>
</body>
</html>