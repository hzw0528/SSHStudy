<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title><s:text name="succPage"/></title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
</head>
<body>
	<%-- <s:text name="succTip">
		<s:param>${sessionScope.user}</s:param>
	</s:text><br/> --%>
	<p>��վ���ʵĴ���:${applicationScope.counter }</p>
	<p>${sessionScope.user },���Ѿ���¼</p>
	<p>${requestScope.tip}</p>
</body>
</html>