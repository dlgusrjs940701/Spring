<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>It's me !</title>
<script src="https://kit.fontawesome.com/a18034e305.js"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
body {
	margin: 0;
	background-color: rgb(167, 184, 206);
}

header {
	position: fixed;
	width: 100%;
	top: 0;
	z-index: 1;
}

.navbar {
	width: 100%;
	padding-top: 25px;
}

.nav-item {
	font-size: 14px;
	text-align: center;
	align-items: center;
	margin-left: 100px;
	margin-right: 128px;
}

.nav-item:hover {
	background-color: rgb(158, 194, 174);
	border-radius: 30%;
}

main {
	position: sticky;
	width: 90%;
	max-width: 800px;
	margin: 60px auto;
	margin-top: 200px;
	background-color: white;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

main .board-title {
	font-size: 24px;
	font-weight: bold;
	margin-bottom: 20px;
}

.board-table th, .board-table td {
	text-align: center;
	padding: 10px;
}

.board-table th {
	background-color: rgb(167, 184, 206);
}

.board-table tr:nth-child(even) {
	background-color: #f9f9f9;
}

footer {
	height: 70px;
	width: 100%;
	background-color: rgb(127, 111, 126);
	font-size: 30px;
	text-align: center;
	position: fixed;
	bottom: 0;
	justify-content: center;
}

footer div {
	width: 10%;
	display: inline-block;
	margin-top: 10px;
}

footer button {
	background-color: rgb(127, 111, 126);
	border: 0px;
	border-radius: 20%;
}
</style>

<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav ms-auto">
						<li class="nav-item"><i class="fa-solid fa-house"></i><a
							class="nav-link" href="">HOME</a></li>
						<li class="nav-item"><i class="fa-solid fa-user"></i><a
							class="nav-link" href="">PROFILE</a></li>
						<li class="nav-item"><i class="fa-solid fa-thumbs-up"></i><a
							class="nav-link" href="">FAVORITE</a></li>
						<li class="nav-item"><i class="fa-solid fa-address-card"></i><a
							class="nav-link" href="board">게시판</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<div class="board-title">게시판</div>

		<!-- 게시판 리스트 테이블 -->
		<table class="table table-bordered board-table">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<!-- 게시글 목록 (예시) -->
				<tr>
					<td>1</td>
					<td><a href="#">첫 번째 게시글</a></td>
					<td>홍길동</td>
					<td>2024-11-12</td>
					<td>100</td>
				</tr>

			</tbody>
		</table>

		<!-- 페이지네이션 -->
		<nav>
			<ul class="pagination justify-content-center">
				<li class="page-item"><a class="page-link" href="#">«</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">»</a></li>
			</ul>
		</nav>

		<!-- 글쓰기 버튼 -->
		<div class="text-center mt-4">
			<a href="boardwrite" class="btn btn-primary">글쓰기</a>
		</div>
	</main>

	<footer>
		<div>
			<button type="button">
				<span><i class="fa-solid fa-phone"></i></span>
			</button>
		</div>
		<div>
			<button type="button">
				<span><i class="fa-brands fa-instagram"></i></span>
			</button>
		</div>
		<div>
			<button type="button">
				<span><i class="fa-brands fa-github"></i></span>
			</button>
		</div>
	</footer>


</body>

</html>