<%--
  Created by IntelliJ IDEA.
  User: lowel
  Date: 2022-08-31
  Time: 오후 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인입니다.</title>
</head>

<body>
<form action="/login" method="post">
    아이디: <input type="text" name = "user_id" id = "id">
    비밀번호: <input type="text" name = "user_pwd" id = "pwd">

    <button type="submit">로그인</button>
</form>


</body>
</html>
