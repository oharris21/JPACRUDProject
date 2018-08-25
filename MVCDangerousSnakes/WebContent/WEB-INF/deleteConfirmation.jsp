<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="nav.jsp"%>

	<c:if test="${empty s.id}">
 		${s.name} successfully deleted
	</c:if>
	<c:if test="${not empty s.id}">
 		${s.name} was not deleted
	</c:if>
	
</body>
</html>