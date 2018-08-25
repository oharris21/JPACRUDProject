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
	<div class="editTable">
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
								type="submit" value="Edit">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>