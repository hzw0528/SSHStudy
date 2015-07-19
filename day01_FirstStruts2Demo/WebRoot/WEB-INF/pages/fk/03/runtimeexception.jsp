<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>运行时异常</title>
</head>
<body>
	<h3>运行时异常</h3>
	<s:property value="exception.message" />
	<br />
	<s:property value="exceptionStack" />
	<p>
		<a href="javascript:history.go(-1)">返回</a>
	</p>
</body>
</html>