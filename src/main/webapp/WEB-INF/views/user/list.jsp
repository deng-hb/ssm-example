<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<body>
    <h2>User list</h2>
    <a href="/user/create">create</a>

    <hr/>
    <table>
        <tr>
            <th>#</th>
            <th>User Name</th>
            <th>Email</th>
            <th>Create Time</th>
            <th>Opt</th>
        </tr>
        <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.email}</td>
            <td>${item.createdTime}</td>
            <td>
                <a href="/user/update/${item.id}">update</a> | <a href="/user/delete/${item.id}">delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>

</body>
</html>
