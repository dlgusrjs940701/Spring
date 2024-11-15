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

main {
	position: sticky;
	width: 400px;
	height: auto;
	/* border: 1px solid; */
	margin: 60px auto;
	margin-top: 200px;
}

main div img {
	width: 100%;
	height: auto;
}

.img1 {
	border-radius: 25%;
}

section {
	text-align: center;
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

.collapse {
	margin-left: 50px;
}

.carousel-inner {
	border-radius: 25%;
	position: sticky;
}

article button {
	background-color: rgb(167, 184, 206);;
	border-radius: 20%;
	border: 0px;
	/* margin-bottom: 10px; */
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
	background-color: rgb(127, 111, 126);;
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
		<div id="carouselExampleIndicators" class="carousel slide">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleIndicators"
					data-bs-slide-to="0" class="active" aria-current="true"
					aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators"
					data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators"
					data-bs-slide-to="2" aria-label="Slide 3"></button>
			</div>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="<%=request.getContextPath()%>/resources/이미지/나.jpg"
						class="d-block w-100" alt="나">
				</div>
				<div class="carousel-item">
					<img src="<%=request.getContextPath()%>/resources/이미지/나1.jpg"
						class="d-block w-100" alt="나1">
				</div>
				<div class="carousel-item">
					<img src="<%=request.getContextPath()%>/resources/이미지/나3.jpg"
						class="d-block w-100" style="height: 533px;" alt="나3">
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
		<section>
			<hr>
			<p>
				<button class="btn btn-light" type="button"
					data-bs-toggle="collapse" data-bs-target="#collapseWidthExample"
					aria-expanded="false" aria-controls="collapseWidthExample">
					더보기</button>
			</p>
			<div style="min-height: 120px;">
				<div class="collapse collapse-horizontal" id="collapseWidthExample">
					<div class="card card-body" style="width: 300px;">나는 이현건입니다.
					</div>
				</div>
			</div>
		</section>
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