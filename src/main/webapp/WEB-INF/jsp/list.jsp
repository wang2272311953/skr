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
<a href="toadd">添加</a>
<table>
	<tr>
		<td>编号</td>
		<td>商品</td>
		<td>价格</td>
		<td>总量</td>
		<td>售出</td>
	</tr>
	<c:forEach items="${list }" var="goods">
			<tr>
		<td>${goods.gid }</td>
		<td>${goods.gname }</td>
		<td>${goods.price }</td>
		<td>${goods.gcount }</td>
		<td>${goods.saleCount }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>