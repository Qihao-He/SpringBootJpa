<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Alien filling info</h2>
	<form action="addAlien">
		<h3>alien id<input type="text" name="aid"><br></h3>
		<h3>alien name<input type="text" name="aname"><br></h3>
		<h3>alien tech<input type="text" name="atech"><br></h3>
		<input type="submit"><br>
	</form>
	<h2>Get Alien using ID</h2>
	<form action="getAlien">
		<h3>alien id<input type="text" name="aid"><br></h3>
		<input type="submit"><br>
	</form>
</body>
</html>