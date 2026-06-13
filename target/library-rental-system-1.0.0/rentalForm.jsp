<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>도서 대여</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-5">

```
<div class="card">

    <div class="card-header bg-success text-white">
        <h3>📖 도서 대여</h3>
    </div>

    <div class="card-body">

        <form action="rental" method="post">

            <div class="mb-3">
                <label class="form-label">대여 도서명</label>
                <input type="text"
                       name="bookTitle"
                       class="form-control"
                       required>
            </div>

            <div class="mb-3">
                <label class="form-label">대여자</label>
                <input type="text"
                       name="borrower"
                       class="form-control"
                       required>
            </div>

            <div class="mb-3">
                <label class="form-label">대여일</label>
                <input type="date"
                       name="rentalDate"
                       class="form-control"
                       required>
            </div>

            <button type="submit"
                    class="btn btn-success">
                대여하기
            </button>

            <button type="button"
                    class="btn btn-secondary"
                    onclick="location.href='rentalList.jsp'">
                목록
            </button>

        </form>

    </div>

</div>
```

</div>

</body>
</html>
