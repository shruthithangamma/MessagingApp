<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:import url="header.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
<c:import url="navbar.jsp"></c:import>
 <p>
  <label>${msg.name}</label> <br/>
  <textarea rows="3" cols="50">${msg.message}</textarea>
  </p>
 
<a href="index.jsp">Back</a>
</body>
</html>