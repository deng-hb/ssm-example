<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<body>
<h2>User update</h2>
    <a href="/user/">back</a>
    ${msg}

    <hr/>
    <form action="/user/update.do" method="POST">
        <input type="hidden" name="id" value="${user.id}" />
        <input type="text" name="username" value="${user.username}" placeholder="User Name" />
        <input type="text" name="email" value="${user.email}" placeholder="Email"/>
        <input type="password" name="password" value="${user.password}" placeholder="Password"/>
        <input type="submit" />
    </form>
</body>
</html>
