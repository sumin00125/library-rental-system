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

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-5">

```
<h2 class="mb-4">📚 도서 목록</h2>
```

<%
BookDAO dao = new BookDAO();
List<BookDTO> bookList = dao.getBookList();
%>

```
<table class="table table-striped table-hover table-bordered align-middle">

    <thead class="table-dark">
        <tr>
            <th>도서명</th>
            <th>저자</th>
            <th>출판사</th>
            <th>ISBN</th>
            <th>카테고리</th>
            <th>수량</th>
            <th>관리</th>
        </tr>
    </thead>

    <tbody>
```

<%
for(BookDTO book : bookList){
%>

```
        <tr>

            <td><%= book.getTitle() %></td>
            <td><%= book.getAuthor() %></td>
            <td><%= book.getPublisher() %></td>
            <td><%= book.getIsbn() %></td>
            <td><%= book.getCategory() %></td>
            <td><%= book.getQuantity() %></td>

            <td>

                <button class="btn btn-success btn-sm">
                    상세보기
                </button>

                <button class="btn btn-primary btn-sm"
                    onclick="location.href='book?action=update&id=<%=book.getBookId()%>'">
                    수정
                </button>

                <button class="btn btn-danger btn-sm"
                    onclick="location.href='book?action=delete&id=<%=book.getBookId()%>'">
                    삭제
                </button>

            </td>

        </tr>
```

<%
}
%>

```
    </tbody>

</table>

<button class="btn btn-dark"
    onclick="location.href='bookForm.jsp'">
    도서 등록
</button>
```

</div>

</body>
</html>
