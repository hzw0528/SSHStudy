<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>根据输入的action名字跳转页面</title>
</head>
<body>
	<h3>根据输入的action名字跳转页面</h3>
	<form method="post"
		action="${pageContext.request.contextPath}/vw/my.action">
		<p>
			跳转页面名字:<input type="text" name="target" />
		</p>
		<p>
			<input type="submit" value="跳转" />
		</p>
		<em>可以输入list、edit、redirect这三个页面名称</em>
	</form>
</body>
</html>