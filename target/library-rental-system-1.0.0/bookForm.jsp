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
<title>도서 등록</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-5">

```
<div class="card">

    <div class="card-header bg-dark text-white">
        <h3>
            <%= book == null ? "📚 도서 등록" : "✏️ 도서 수정" %>
        </h3>
    </div>

    <div class="card-body">

        <form action="book" method="post">

            <input type="hidden"
                   name="bookId"
                   value="<%= book == null ? "" : book.getBookId() %>">

            <div class="mb-3">
                <label class="form-label">도서명</label>
                <input type="text"
                       name="title"
                       class="form-control"
                       value="<%= book == null ? "" : book.getTitle() %>">
            </div>

            <div class="mb-3">
                <label class="form-label">저자</label>
                <input type="text"
                       name="author"
                       class="form-control"
                       value="<%= book == null ? "" : book.getAuthor() %>">
            </div>

            <div class="mb-3">
                <label class="form-label">출판사</label>
                <input type="text"
                       name="publisher"
                       class="form-control"
                       value="<%= book == null ? "" : book.getPublisher() %>">
            </div>

            <div class="mb-3">
                <label class="form-label">ISBN</label>
                <input type="text"
                       name="isbn"
                       class="form-control"
                       value="<%= book == null ? "" : book.getIsbn() %>">
            </div>

            <div class="mb-3">
                <label class="form-label">카테고리</label>
                <input type="text"
                       name="category"
                       class="form-control"
                       value="<%= book == null ? "" : book.getCategory() %>">
            </div>

            <div class="mb-3">
                <label class="form-label">수량</label>
                <input type="number"
                       name="quantity"
                       class="form-control"
                       value="<%= book == null ? "" : book.getQuantity() %>">
            </div>

            <button type="submit"
                    class="btn btn-primary">
                <%= book == null ? "등록" : "수정" %>
            </button>

            <button type="button"
                    class="btn btn-secondary"
                    onclick="location.href='bookList.jsp'">
                목록
            </button>

        </form>

    </div>

</div>
```

</div>

</body>
</html>
