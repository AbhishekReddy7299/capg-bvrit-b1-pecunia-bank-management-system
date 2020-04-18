<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Trainee Details </title>
</head>
<body  style="margin-left: 600px;margin-top: 100px">
   <h2>Trainees Details</h2>
    <table border="2">
        <tr><th>Trainee ID</th><th>Trainee Name</th><th>Trainee Location</th><th>Trainee Domain</th></tr>
        
        	
        <c:forEach items="${traineeList }" var="trainee">
        <tr>
            <td>${trainee.traineeId }</td>
            <td>${trainee.traineeName }</td>
            <td>${trainee.traineeLocation }</td>
            <td>${trainee.traineeDomain }</td>
        </tr>
        </c:forEach>
        
    
    </table>
   
</body>
</html>