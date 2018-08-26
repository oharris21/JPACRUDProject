<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="create-bg">
<head>
<link rel="stylesheet" type="text/css" href="DeleteConfirmation.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="topnav">
		<ul>
			<li><a href="index.html">Home</a></li>
			<li><a href="create.html">Create a Snake</a></li>
			<li><a href="EditList.do">Edit a Snake</a></li>
			<li><a href="DeleteList.do">Delete a Snake</a></li>
		</ul>
	</div>

	<h2>Delete Confirmation</h2>
	<div class="deleted">
		<c:if test="${empty s.id}">
 		${s.name} successfully deleted
	</c:if>
		<c:if test="${not empty s.id}">
 		${s.name} was not deleted
	</c:if>
	</div>

</body>
</html>