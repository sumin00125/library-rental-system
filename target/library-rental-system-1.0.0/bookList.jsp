<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="dao.BookDAO" %>
<%@ page import="dto.BookDTO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 목록</title>
</head>
<body>

<h2>도서 목록</h2>

<%
    BookDAO dao = new BookDAO();
    List<BookDTO> bookList = dao.getBookList();
%>

<table border="1">

<tr>
    <th>도서명</th>
    <th>저자</th>
    <th>출판사</th>
    <th>ISBN</th>
    <th>카테고리</th>
    <th>수량</th>
    <th>관리</th>
</tr>

<%
for(BookDTO book : bookList){
%>

<tr>
    <td><%= book.getTitle() %></td>
    <td><%= book.getAuthor() %></td>
    <td><%= book.getPublisher() %></td>
    <td><%= book.getIsbn() %></td>
    <td><%= book.getCategory() %></td>
    <td><%= book.getQuantity() %></td>

    <td>
        <button>상세보기</button>
        <button onclick="location.href='book?action=update'">수정</button>
        <button onclick="location.href='book?action=delete'">삭제</button>
    </td>
</tr>

<%
}
%>

</table>

<br>
<button onclick="location.href='bookForm.jsp'">
도서 등록
</button>

</body>
</html>