<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>검색 결과</title>
</head>
<body>
    <h1>단어 검색 결과</h1>
    <hr>

    <!-- 단어가 있음 -->
    <c:if test="${not empty word}">
        <h3>${word}의 뜻은: ${mean}입니다.</h3>
    </c:if>

    <!-- 단어가 없음 -->
    <c:if test="${not empty error}">
        <h3>${error}</h3>
    </c:if>

    <a href="word">뒤로가기</a>
</body>
</html>
