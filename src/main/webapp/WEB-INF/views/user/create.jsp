<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<body>
<h2>User create</h2>
<a href="/user/">back</a>
${msg}

    <hr/>
    <form action="/user/create.do" method="POST">
        <input type="text" name="username" placeholder="User Name" />
        <input type="text" name="email" placeholder="Email"/>
        <input type="password" name="password" placeholder="Password"/>
        <input type="submit" />
    </form>
</body>
</html>
