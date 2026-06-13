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

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-5">

```
<h2 class="mb-4">📋 대여 목록</h2>
```

<%
RentalDAO dao = new RentalDAO();
List<RentalDTO> rentalList = dao.getAllRentals();
%>

```
<table class="table table-striped table-hover table-bordered align-middle">

    <thead class="table-success">

        <tr>
            <th>ID</th>
            <th>도서명</th>
            <th>대여자</th>
            <th>대여일</th>
            <th>반납일</th>
            <th>관리</th>
        </tr>

    </thead>

    <tbody>
```

<%
for(RentalDTO rental : rentalList){
%>

```
        <tr>

            <td><%= rental.getRentalId() %></td>
            <td><%= rental.getBookTitle() %></td>
            <td><%= rental.getBorrower() %></td>
            <td><%= rental.getRentalDate() %></td>

            <td>
                <%= rental.getReturnDate() == null ? "-" : rental.getReturnDate() %>
            </td>

            <td>

                <button class="btn btn-warning btn-sm"
                    onclick="location.href='rental?action=return&id=<%=rental.getRentalId()%>'">
                    반납
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

<button class="btn btn-success"
    onclick="location.href='rentalForm.jsp'">
    대여 등록
</button>
```

</div>

</body>
</html>
