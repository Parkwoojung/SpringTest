<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<>
<head>
    <meta charset="utf-8">
    <title>웹페이지 제목</title>
</head>
<body>
<h2>회원가입 페이지</h2>
<form action="/user/userProc" method="post">
    이름: <input type="text" name="name" id="name">
    아이디: <input type="text" name="id" id="id">
    성별: <input type="text" name="gender" id="gender">
    이메일: <input type="text" name="email" id="email">
    비밀번호: <input type="text" name="pwd" id="pwd">
    <button type="submit">입력하기</button>
</form>
</body>
</html>        