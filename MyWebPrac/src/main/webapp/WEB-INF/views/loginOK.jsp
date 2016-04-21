<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<script type="text/javascript">
	$(document).ready(function() {
		$("#logoutButton").click(function() {
			location.href = "/mwp/logout.do";
		});
	});
</script>

</head>

<body>
	<div class="container">
		<h2>Panel Group</h2>
		<p></p>
		<div class="panel-group">
			<div class="panel panel-default">
				<div class="panel-heading">
					<b>${sessionScope.loginUser.m_emailID}</b>님 어서오세요
					</td>
				</div>
				<div class="panel-body">
					<label for="comment">Comment:</label>
					<textarea class="form-control" rows="5" id="comment"></textarea>
				</div>
				<div class="panel-footer">
					<button id="logoutButton" type="button" class="btn btn-danger">logout</button>
				</div>
			</div>


		</div>
	</div>


</body>
</html>