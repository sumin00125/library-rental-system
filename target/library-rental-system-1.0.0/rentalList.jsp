<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>대여 목록</title>
</head>
<body>

<h2>대여 목록</h2>

<table border="1">

<tr>
    <th>도서명</th>
    <th>대여자</th>
    <th>대여일</th>
    <th>반납</th>
</tr>

<tr>
    <td>자바 프로그래밍</td>
    <td>홍길동</td>
    <td>2026-06-01</td>
    <td>
        <button onclick="location.href='rental?action=return'">
            반납
        </button>
    </td>
</tr>

</table>

</body>
</html>
