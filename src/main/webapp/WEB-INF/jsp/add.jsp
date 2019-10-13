<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link href="<%=request.getContextPath()%>/css/index_like1.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.2.min.js">
</script>
<body>
<form action="addgoods" method="post">
	商品名称：<input type="text" name="gname"><br>
	商品价格：<input type="text" name="price"><br>
	商品总量：<input type="text" name="gcount"><br>
	销售总量：<input type="text" name="saleCount"><br>
	<button>添加</button>
</form>
</body>
</html>