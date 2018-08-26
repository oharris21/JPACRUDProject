<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="edit-bg">
<head>
<link rel="stylesheet" type="text/css" href="EditSnake.css">
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
	<h2>Edit A Snake</h2>
	<table>
		<tr>
			<th>Name</th>
			<th>Characteristics</th>
		</tr>
		<c:forEach var="s" items="${snakeList}">
			<tr>
				<td>${s.name}</td>
				<td>${s.characteristics}</td>
				<td>
					<form action="Edit.do" method="GET">
						<input type="hidden" name="id" value="${s.id}"> <input
							type="submit" id="submit" value="Edit">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>