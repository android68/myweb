<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="reg" method="post">
	<p>
	<input type="text" name="userid" value="${userid }"/>${errorMessageUserid }
	</p>
	<p>
	<input type="text" name="password" value="${password }"/> ${errorMessagePassword }
	</p>
	<p>
	<input type="text" name="password2" value="${password2 }"/>${errorMessagePasswordNotMatch }
	</p>
	<p>
	<input type="text" name="email" value="${email }"/>${errorMessageEmail }
	</p>
	<input type="submit" value="註冊">
	
</form>
</body>
</html>