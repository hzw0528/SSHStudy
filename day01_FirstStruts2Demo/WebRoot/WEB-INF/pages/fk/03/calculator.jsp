<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简单计算器</title>
<script type="text/javascript">
 window.onload=function()
 {
	 document.getElementById("type").value="${type}";
 }
</script>
</head>
<body>
	<h3>简单的计算器</h3>
	<form method="post" action="${pageContext.request.contextPath }/ex/calculation.action">
	<p>
		操作数1:<input type="text" name="num1" value="${num1}" />
	</p>
	<p>
		运算类型:<select name="type" id="type">
			<option value="+">加法</option>
			<option value="-">减法</option>
			<option value="*">乘法</option>
			<option value="/">除法</option>
		</select>
	</p>
	<p>
		操作数2:<input type="text" name="num2" value="${num2}" />
	</p>
	<p>
		计算结果:<input type="text" name="result" value="${result}">
	</p>
	<p>
		<input type="submit" value="计算" />
	</p>
	</form>
</body>
</html>