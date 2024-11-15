<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
  integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

<style>
  body {
    margin: 0px;
    width: 1920px;
    height: 1024px;
  }

  #userinfo {
    display: inline-block;
    width: 1000px;
    height: 50px;
    /*  background-color: aqua;*/
    top: 40px;
    left: 1700px;
    position: absolute;
  }

  #header {
    width: 1920px;
    height: 100px;
    /* background-color: rgb(98, 139, 253);*/
    padding-top: 20px;
    box-sizing: border-box;
    float: left;
    /* display: flex;*/

  }

  .header_20 input[type=text] {
    width: 500px;
    height: 32px;
    font-size: 15px;
    border: solid 1px gray;
    border-radius: 15px;
    outline: none;
    margin-bottom: 10px;
    background-color: rgb(233, 233, 233);
  }

  .header_10 {
    width: 400px;
    height: 40px;
    /* border: 1px solid;*/
    margin: 0px auto;
    text-align: center;
    float: left;
  }

  .header_20 {
    padding-top: 5px;
    width: 1500px;
    height: 40px;
    /* border: 1px solid;*/
    margin: 0px auto;
    text-align: center;
    float: left;
  }

  .header_10 h2 {
    display: inline;
    color: green;
    font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;
  }

  #nav {
    width: 1920px;
    height: 60px;
    float: left;
    border-bottom: 1px solid;
    font-size: larger;
  }

  /*
    #nav ul li{
        color:black;
    }
     #nav ul li:hover{
        background-color: aqua;
    } */
  /*   ul {
*/
  /*   border: 1px solid;
        margin-top: 3px;
    }*/
  ul li {
    display: inline-block;
    width: 120px;
    /*   border: 1px solid;*/

  }

  #mainsection {
    width: 80%;
    height: 900px;
    /*  border: 1px dotted;*/
    float: left;
    box-sizing: border-box;
  }

  #mainsection_01 {
    width: 80%;
    height: 300px;
    /*   border: 1px solid;
    /*    background-color: red;*/
    margin: 0px auto;
    text-align: center;
    float: left;
  }

  #asidelogin {
    width: 20%;
    height: 500px;
    /* border: 1px solid;*/
    float: left;
  }

  .subject {
    display: inline-block;
    font-size: larger;
    margin-bottom: 5px;
  }

  #login {
    background-color: darkcyan;
    padding-top: 15px;
    border-radius: 5px;
    box-sizing: border-box;
    color: white;

  }

  #login,
  #loginup,
  #logindown {
    width: 250px;
    height: 50px;
    text-align: center;
    vertical-align: middle;
    margin: 0px auto;

  }

  #loginbox {
    margin-top: 30px;
    box-sizing: border-box;
  }

  #infosection {
    width: 1920px;
    height: 150px;
    /* border: 1px solid;*/
    float: left;
  }

  .infosetion_card {
    width: 360px;
    height: 150px;
    margin-left: 20px;
    /* background-color: yellow;*/
    float: left;
  }

  #footer {
    width: 1920px;
    text-align: center;
    font-size: larger;
    /* border: 1px solid;*/
    float: left;
  }
</style>
<style>
  .dropdown {
    display: inline-block;
    position: relative;
  }

  #btn01,
  #btn02,
  #btn03,
  #btn04,
  #btn05 {
    border: none;
    border-radius: 5px;
    padding: 3px 30px;
    font-size: 18px;
    cursor: pointer;
    display: inline-block;
    background-color: white;
  }

  button:hover {
    background-color: #ddd;
  }

  .dropdown-options {
    display: none;
    position: absolute;
    overflow: auto;
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0px 10px 10px 0px rgba(0, 0, 0, 0.4);
  }

  .dropdown:hover .dropdown-options {
    display: block;
  }

  .dropdown-options a {
    display: block;
    color: #000000;
    padding: 5px;
    text-decoration: none;
    padding: 20px 40px;
  }

  .dropdown-options a:hover {
    color: #0a0a23;
    background-color: #ddd;
    border-radius: 5px;
  }
</style>
<style>
  /*boot strap에서 마우스 올려 놓으면 메뉴 자동 펼치기 추가 코드 */
  nav li.dropdown:hover>ul.dropdown-menu {
    display: block;
    margin: 0;
  }
</style>

<body>
  <%@ include file="../include/top.jsp" %>
  <div id="mainsection">
    <style>
      #mainsection_left {
        /*  display: inline-block;*/
        float: left;
        width: 300px;
        height: 500px;
        /*    border: 1px solid;*/
        padding: 20px 20px 20px 30px;
        box-sizing: border-box;
      }
    </style>
    <div id="mainsection_left">

      <div class="btn-group-vertical" role="group" aria-label="Vertical button group">
        <button type="button" class="btn btn-primary">Button</button>
        <button type="button" class="btn btn-primary">Button</button>
        <div class="btn-group" role="group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </button>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
          </ul>
        </div>
        <div class="btn-group dropstart" role="group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </button>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
          </ul>
        </div>
        <div class="btn-group dropend" role="group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </button>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
          </ul>
        </div>
        <div class="btn-group dropup" role="group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </button>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div id="mainsection_01">
      <br>
      <div>
        <div class="card text-center">
          <div class="card-body">
            <h5 class="card-title">게시글 수정</h5>
          </div>
        </div>
      </div>

      <form class="row g-3" action="mod" method="post">
        <div class="col-md-4">
          <label for="inputState" class="form-label">놀이터 선택</label>
          <select id="inputState" class="form-select" name="type">
            <option 
            <c:if test="${boardvo.type eq 'Database'}">
            selected
            </c:if>>Database</option>
            
            <option 
            <c:if test="${boardvo.type eq 'Java'}">selected
            </c:if>
            >Java</option>
          </select>
        </div>
        <div class="col-md-3">
          <label for="inputCity" class="form-label">작성자</label>
          <input type="text" class="form-control" id="inputCity" name="username" value="${boardvo.username }">
        </div>
        <div class="col-md-3">
          <label for="inputPassword4" class="form-label">Password</label>
          <input type="password" class="form-control" id="inputPassword4" name="pass" value="${boardvo.pass }">
        </div>
        <div class="col-12">
          <label for="inputAddress" class="form-label">제목</label>
          <input type="text" class="form-control" id="inputAddress" placeholder="제목을 입력하세요" name="title" value="${boardvo.title }" readonly>
        </div>


        <div class="form-floating">
          <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea2"
            style="height: 200px" name="content">${boardvo.content }"</textarea>
          <label for="floatingTextarea2">Comments</label>
        </div>
        <div class="mb-3">
          <input class="form-control" type="file" id="formFile">
          <input class="form-control" type="file" id="formFile">
        </div>

        <div class="col-12">
          <div class="form-check">
            <input class="form-check-input" type="checkbox" id="gridCheck" name="viewmember" value=1
            	<c:if test="${boardvo.viewmember eq '비공개'}">
            	checked
            	</c:if>            
            >
            <label class="form-check-label" for="gridCheck">
              회원만 보기
            </label>
          </div>
        </div>
        <div class="col-12">
           <input type="hidden" 
           name="num" value="${boardvo.num}">
          <button type="submit" class="btn btn-primary">수정하기</button>
          <!--  submit 타입은 form action으로 지정된 곳으로 이동 -->
        </div>
      </form>
    </div>

  </div>
  </div>
  <div id="asidelogin">
    <div id="loginbox">
      <div id="loginup">
        KimTeacher Lap에 참여하세요
      </div>
      <div id="login" data-bs-toggle="modal" data-bs-target="#loginModal">
        KimTeacher 로그인
      </div>
      <div id="logindown">
        <br>
        <button type="button" data-bs-toggle="modal" data-bs-target="#exampleModal">
          회원가입
        </button>
        <button type="button">아이디/비빌번호찾기</button>

      </div>
      <style>
        #news {
          border: 1px solid;
          display: inline-block;
          width: 100%;
          height: 300px;
          margin: 0px auto;
          border-radius: 5%;
          border-color: rgb(196, 193, 193);
          background-color: white;
        }

        #talks {
          border: 1px solid;
          display: inline-block;
          width: 100%;
          height: 150px;
          margin: 0px auto;
          border-radius: 5%;
          border-color: rgb(196, 193, 193);
          background-color: white;
        }
      </style>
      <br>
      <div id="news">
        <img src="./img/we.PNG">
      </div>
      <div id="talks">
      </div>
    </div>
    <div>


    </div>
  </div>
  <div id="footer">
    <hr>
    김티처 tel. 010-9407-8767
  </div>
  <%@ include file="../include/tailModal.jsp" %>
</body>

</html>