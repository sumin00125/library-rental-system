<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 대여</title>
</head>
<body>

<h2>도서 대여</h2>

<form action="rental" method="post">

대여 도서명 :
<input type="text" name="bookTitle"><br><br>

대여자 :
<input type="text" name="borrower"><br><br>

대여일 :
<input type="date" name="rentalDate"><br><br>

<input type="submit" value="대여하기">

</form>

</body>
</html>
