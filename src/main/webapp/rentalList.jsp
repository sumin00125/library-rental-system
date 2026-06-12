<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="dao.RentalDAO" %>
<%@ page import="dto.RentalDTO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>대여 목록</title>
</head>
<body>

<h2>대여 목록</h2>

<%
    RentalDAO dao = new RentalDAO();
    List<RentalDTO> rentalList = dao.getAllRentals();
%>

<table border="1">

<tr>
    <th>도서명</th>
    <th>대여자</th>
    <th>대여일</th>
    <th>반납예정일</th>
</tr>

<%
for(RentalDTO rental : rentalList){
%>

<tr>
    <td><%= rental.getBookTitle() %></td>
    <td><%= rental.getBorrower() %></td>
    <td><%= rental.getRentalDate() %></td>
    <td><%= rental.getReturnDate() %></td>
</tr>

<%
}
%>

</table>

<br>

<button onclick="location.href='rentalForm.jsp'">
대여 등록
</button>

</body>
</html>