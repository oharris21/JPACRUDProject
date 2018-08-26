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
	<%@ include file="nav.jsp"%>
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