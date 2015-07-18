<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试ServletActionContext</title>
</head>
<body>
   <p>用户名:${cookie.username.value}</p>
   <p>名字:${sessionScope.name}</p>
   <p>年龄:${requestScope.age}</p>
</body>
</html>