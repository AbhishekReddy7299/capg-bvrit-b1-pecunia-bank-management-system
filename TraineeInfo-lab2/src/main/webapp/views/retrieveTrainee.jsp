<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve Trainee</title>
</head>
<body style="margin-left: 600px;margin-top: 100px">
<form action="retrieve" method="get" >
  <h2>Retrieve Operation</h2>
      <tr>
	      <td><strong>Please enter trainee ID</strong></td>
	      <td><input type="number" name="traineeId"></td>
	      <td><button type="submit">search</button></td>
      </tr>
</form>
<c:if test="${trainee ne null }">
     <br>
      <h1>Trainee Info</h1>
     <br>
     
     <table border="1">
        <tr><td>ID</td><td>${trainee.traineeId }</td></tr>
        <tr><td>Name</td><td>${trainee.traineeName }</td></tr>
        <tr><td>Domain</td><td>${trainee.traineeDomain }</td></tr>
        <tr><td>Location</td><td>${trainee.traineeLocation }</td></tr>
        
    </table>
</c:if>



</body>
</html>