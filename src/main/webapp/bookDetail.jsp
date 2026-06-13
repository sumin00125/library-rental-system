<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="dto.BookDTO" %>

<%
BookDTO book =
    (BookDTO)request.getAttribute("book");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 상세정보</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet">

</head>
<body>

<div class="container mt-5">

    <div class="card">

        <div class="card-header bg-success text-white">
            <h3>📖 도서 상세정보</h3>
        </div>

        <div class="card-body">

            <table class="table table-bordered">

                <tr>
                    <th width="20%">도서명</th>
                    <td><%= book.getTitle() %></td>
                </tr>

                <tr>
                    <th>저자</th>
                    <td><%= book.getAuthor() %></td>
                </tr>

                <tr>
                    <th>출판사</th>
                    <td><%= book.getPublisher() %></td>
                </tr>

                <tr>
                    <th>ISBN</th>
                    <td><%= book.getIsbn() %></td>
                </tr>

                <tr>
                    <th>카테고리</th>
                    <td><%= book.getCategory() %></td>
                </tr>

                <tr>
                    <th>수량</th>
                    <td><%= book.getQuantity() %></td>
                </tr>

            </table>

            <button class="btn btn-primary"
                onclick="location.href='book?action=update&id=<%=book.getBookId()%>'">
                수정
            </button>

            <button class="btn btn-danger"
                onclick="location.href='book?action=delete&id=<%=book.getBookId()%>'">
                삭제
            </button>

            <button class="btn btn-secondary"
                onclick="location.href='bookList.jsp'">
                목록
            </button>

        </div>

    </div>

</div>

</body>
</html>