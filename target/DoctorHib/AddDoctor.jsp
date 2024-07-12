<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="AddDoctor.jsp">

Doctor Name :
<input type="text" name="DoctorName" /><br><br>
Specialization:
<input type="text" name="Specialization"/><br><br>
Qualification :
<input type="text" name="Qualification"><br><br>
AvailableSlot :
<Select name="availableslot">
<option value="general" >General</option>
<option value="morning" >Morning</option>
<option value="evening" >Evening</option>
<option value="weekends" >Weekends</option>
<option value="callon" >CallOn</option>
</Select><br><br><br>
 <input type="submit" value="Insert Doctor"/>
<c:if test="${param.DoctorName!=null }">
    <jsp:useBean id="beanDoctorDao" class="com.java.DoctorHib.DoctorDaoImpl" />
    <jsp:useBean id="doctor" class="com.java.DoctorHib.Doctor" />   
 
    <jsp:setProperty property="doctorname" name="doctor" param="doctorname"/>
    <jsp:setProperty property="specialization" name="doctor" param="specialization"/>
    <jsp:setProperty property="qualification" name="doctor" param="qualification"/>
    <jsp:setProperty property="availableslot" name="doctor" param="availableslot"/>
    
    <c:out value="${beanDoctorDao.adddoctorDao(doctor)}" />
    <jsp:forward page="ShowDoctor.jsp" />
    
    
</c:if>
</form>
</body>
</html>