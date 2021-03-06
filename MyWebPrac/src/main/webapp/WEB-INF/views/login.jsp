<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>

</head>
<body>


	<div class="container" style="padding: 40px 50px; width: 450px;">
		<div class="header" style="padding: 35px 50px;">
			<h4>
				<span class="glyphicon glyphicon-lock"></span> Login
			</h4>
		</div>
		<div>${result}</div>
		<form role="form" action="login.do" method="post">
			<div class="form-group">
				<label for="usrname"><span class="glyphicon glyphicon-user"></span>
					Username</label> <input type="text" class="form-control" name="m_emailID"
					id="usrname" placeholder="Enter email" value="${cookie.lastLoginID.value}">
			</div>
			<div class="form-group">
				<label for="psw"><span class="glyphicon glyphicon-eye-open"></span>
					Password</label> <input type="password" class="form-control" name="m_pw"
					id="psw" placeholder="Enter password">
			</div>
			<div class="checkbox">
				<label><input type="checkbox" value="" checked>Remember
					me</label>
			</div>
			<button type="submit" class="btn btn-success btn-block">
				<span class="glyphicon glyphicon-off"></span> Login
			</button>
		</form>
	</div>
</body>
</html>