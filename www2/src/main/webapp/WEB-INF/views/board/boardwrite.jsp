<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>It's me !</title>
    <script src="https://kit.fontawesome.com/a18034e305.js" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
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

    .board-title {
        font-size: 24px;
        font-weight: bold;
        margin-bottom: 20px;
    }

    .board-form input,
    .board-form textarea {
        width: 100%;
        margin-bottom: 15px;
        padding: 10px;
        font-size: 16px;
        border-radius: 5px;
        border: 1px solid #ddd;
    }

    .board-form button {
        width: 100%;
        padding: 10px;
        background-color: rgb(167, 184, 206);
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
    }

    .board-form button:hover {
        background-color: rgb(158, 194, 174);
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
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item"><i class="fa-solid fa-house"></i><a class="nav-link" href="">HOME</a></li>
                        <li class="nav-item"><i class="fa-solid fa-user"></i><a class="nav-link" href="">PROFILE</a></li>
                        <li class="nav-item"><i class="fa-solid fa-thumbs-up"></i><a class="nav-link" href="">FAVORITE</a></li>
                        <li class="nav-item"><i class="fa-solid fa-address-card"></i><a class="nav-link" href="board">게시판</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <main>
        <div class="board-title">게시판 글쓰기</div>

        <!-- 게시판 글쓰기 폼 -->
        <form class="board-form" action="writeProcess.jsp" method="post">
            <div class="mb-3">
                <label for="title" class="form-label">제목</label>
                <input type="text" class="form-control" id="title" name="title" placeholder="제목을 입력하세요" required>
            </div>

            <div class="mb-3">
                <label for="writer" class="form-label">작성자</label>
                <input type="text" class="form-control" id="writer" name="writer" placeholder="작성자를 입력하세요" required>
            </div>

            <div class="mb-3">
                <label for="content" class="form-label">내용</label>
                <textarea class="form-control" id="content" name="content" rows="6" placeholder="내용을 입력하세요" required></textarea>
            </div>

            <button type="submit" class="btn btn-primary">글쓰기</button>
        </form>
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
