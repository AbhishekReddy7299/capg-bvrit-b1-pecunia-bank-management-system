<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify Trainee</title>
</head>
<body style="margin-left: 600px;margin-top: 100px">
      <h2>Trainee Info</h2>
      <br>
     <form action="modify1" method="post" >
     <table border="1">
        <tr><td>Trainee Id</td><td><input type="number" name="traineeId" placeholder="${trainee.traineeId }" required="required"></td></tr>
        <tr><td>Trainee Name</td><td><input type="text" name="traineeName" placeholder="${trainee.traineeName }" required="required"></td></tr>
        <tr><td>Trainee Location</td><td><input type="text" name="traineeLocation" placeholder="${trainee.traineeLocation }" required="required"></td></tr>
        <tr><td>Trainee Domain</td><td><input type="text" name="traineeDomain" placeholder="${trainee.traineeDomain }" required="required"></td></tr>
        <tr><td><button type="submit">Modify</button></td></tr>
    </table>
    </form>
</body>
</html>