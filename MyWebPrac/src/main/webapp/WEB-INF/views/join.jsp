<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>join</title>
</head>
<body>

	<div class="container" style="width:400px">
		<h2>회원 가입</h2>
		<form role="form" action="join.do" method="post">
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" name="m_emailID" id="email"
					placeholder="Enter email">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" name="m_pw" id="pwd"
					placeholder="Enter password">
			</div>
			<div class="form-group ">
				<label for="pwdchk">Password확인:</label> <input type="password"
					class="form-control" name="pwdchk" id="pwdchk"
					placeholder="Enter password">
			</div>
			<div class="form-group">
				<label for="phoneNO">핸드폰</label> <input type="text"
					class="form-control" name="m_phoneNO" id="phoneNO"
					placeholder="핸드폰 번호">
			</div>
			<div class="form-group">
				<label for="birthD">생년월일</label> <input type="text"
					class="form-control" name="m_birthD" id="birthD"
					placeholder="8자리 ex)19860228">
			</div>

			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

</body>
</html>