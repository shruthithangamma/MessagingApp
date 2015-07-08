<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:import url="header.jsp"></c:import>
<title>Insert title here</title>
</head>

<body>
<c:import url="navbar.jsp"></c:import>
<form action="MessageApp" method="post">
       <label for="name">Name:</label>
       <input id="name" name="name" required="required" style="margin-left:17px"></input><br>
        <label for="message" >Message:</label>
       <textarea style="margin-top:10px" id="message" name="message" cols="50" rows="3" maxlength="140" required="required"></textarea><br>
       <button style="width:80px; margin-left:400px;margin-top:10px;" type="submit" value="Submit">Click</button>
</form>
<br>
<form action="MessageApp" method="get">
	<button type="submit" name="action" value="recent">Get Recent</button>
	<button type="submit" name="action" value="older">older msg</button>
</form>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</body>
</html>