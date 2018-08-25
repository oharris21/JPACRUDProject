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

		<form action="Edit.do" method="POST">
			<input type="hidden" name="id" value="${snake.id}" />
		<table>
			<tr>
				<td><label for="name">Name: </label></td>
				<td><input type="text" name="name" value="${snake.name}" /></td>
			</tr>
			<tr>
				<td><label for="colors">Colors:</label></td>
				<td><input type="text" name="colors" value="${snake.colors}" /></td>
			</tr>
			<tr>
				<td><label for="length">Length (in):</label></td>
				<td><input type="text" name="length"
					value="${snake.lengthInInches}" /></td>
			</tr>
			<tr>
				<td><label for="weight">Weight (lbs):</label></td>
				<td><input type="text" name="weight"
					value="${snake.weightInLbs}" /></td>
			</tr>
			<tr>
				<td><label for="habitat">Habitat:</label></td>
				<td><input type="text" name="habitat" value="${snake.habitat}" /></td>
			</tr>
			<tr>
				<td><label for="region">Region:</label></td>
				<td><input type="text" name="region" value="${snake.region}" /></td>
			</tr>
			<tr>
				<td><label for="howVenemous">Venom Level (0-5):</label></td>
				<td><input type="text" name="howVenemous"
					value="${snake.howVenemous}" /></td>
			</tr>
			<tr>
				<td><label for="characteristics">Characteristics:</label></td>
				<td><input type="text" name="characteristics"
					value="${snake.characteristics}" /></td>
			</tr>
		</table>
			<input type="submit" value="Done">
		</form>
	</form>
</body>
</html>