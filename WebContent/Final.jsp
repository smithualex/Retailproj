<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="lightyellow">
<h1>Your final balance is: ${finalbalance}</h1>
<h4>Do you want to print the receipt or get the E-receipt?</h4>
<a id="mailto" href="https://mail.google.com/mail/u/0/#inbox" style="display:inline-block" target="_newtab" >
        <img src="@Url.Content("~/Content/HomePage/email.png")" alt="E-receipt" /></a>
<br/><button onClick=window.print()>print</button>
<a id="mailto" href="http://localhost:8082/Project/Login.html" target="_newtab" >
        <img src="@Url.Content("~/Content/HomePage/email.png")" alt="EXIT" /></a>
<input type="submit"
			name="finish" value="finish">
			<a href="Register.jsp"></a>
</form>
</body>
</html>