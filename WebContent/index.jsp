<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="MessageApp" method="post">
       <label for="name">Name:</label>
       <input id="name" name="name" required="required" style="margin-left:17px"></input><br>
        <label for="message" >Message:</label>
       <textarea style="margin-top:10px" id="message" name="message" cols="50" rows="3" maxlength="140" required="required"></textarea><br>
       <button style="width:80px; margin-left:400px;margin-top:10px;" type="submit" value="Submit">Click</button>
</form>
</body>
</html>