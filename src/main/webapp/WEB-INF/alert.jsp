<%--
  Created by IntelliJ IDEA.
  User: lowel
  Date: 2022-08-31
  Time: 오후 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>alertPage</title>
</head>
<body>
<script type="text/javascript">
    var message = "${msg}";
    var url = "${url}";
    alert(message);
    document.location.href = url;
</script>
</body>
</html>
