<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="<%=request.getContextPath()%>/dolog">
    用户名:<input type="text" name="username"><br/>
    密码:<input type="password" name="password"><br/>
    <input type="submit" name="提交">
</form>
</body>
</html>
