<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AdminServlet" method="post">
		Product id: <input type="text" name="prod_id" ><br>
		prod_name: <input type="text" name="prod_name"> <br> 
		quantity: <input type="text" name="quantity"> <br>
		Store_price: <input type="text" name="store_price"value="" > <br> 
		price: <input type="text" name="price"value="" > <br>
			<input type="submit"name="submit" value="submit">
	</form>
</body>
</html>