<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>도서 대여 관리 시스템</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-5">

```
<div class="text-center mb-5">

    <h1 class="display-4">
        📚 도서 대여 관리 시스템
    </h1>

    <p class="lead">
        JSP / Servlet + MySQL 기반 프로젝트
    </p>

</div>

<div class="row">

    <div class="col-md-4">

        <div class="card shadow">

            <div class="card-body text-center">

                <h3>📖 도서 관리</h3>

                <p>
                    도서 조회, 등록, 수정, 삭제
                </p>

                <button class="btn btn-primary"
                    onclick="location.href='bookList.jsp'">
                    이동
                </button>

            </div>

        </div>

    </div>

    <div class="col-md-4">

        <div class="card shadow">

            <div class="card-body text-center">

                <h3>📋 대여 관리</h3>

                <p>
                    도서 대여 및 반납 관리
                </p>

                <button class="btn btn-success"
                    onclick="location.href='rentalList.jsp'">
                    이동
                </button>

            </div>

        </div>

    </div>

    <div class="col-md-4">

        <div class="card shadow">

            <div class="card-body text-center">

                <h3>➕ 도서 등록</h3>

                <p>
                    신규 도서 등록
                </p>

                <button class="btn btn-dark"
                    onclick="location.href='bookForm.jsp'">
                    이동
                </button>

            </div>

        </div>

    </div>

</div>
```

</div>

</body>
</html>
