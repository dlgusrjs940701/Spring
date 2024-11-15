<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>브롤 단어장</title>
</head>
<body>
	<h1>브롤 단어장</h1>
	<hr>

	<div id="word">
		<h3>
			등록되어 있는 단어:
			<c:forEach var="word" items="${list.keySet()}">
				${word}
			</c:forEach>
		</h3>


		<form id="searchResult" action="result" method="get">
			<label for="word">단어 입력: </label> <input type="text" name="word">
			<input type="submit" value="검색">
		</form>
	</div>

</body>
</html>
