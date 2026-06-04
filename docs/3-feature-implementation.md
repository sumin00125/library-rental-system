# 3.1 기능 구현 현황

| 요구사항 번호 | 간단 설명 | 관련 소스 | 구현 여부 |
|--------------|----------|----------|----------|
| F-01 | 도서 등록 | BookDTO, BookDAO, BookController, bookForm.jsp | 🔶 |
| F-02 | 도서 목록 조회 | BookDAO, BookController, bookList.jsp | 🔶 |
| F-03 | 도서 대여 및 반납 | RentalDTO, RentalDAO, RentalController, rentalForm.jsp, rentalList.jsp | 🔶 |

# 3.2 구현 내용 설명

## F-01 도서 등록
구현 여부: 🔶 부분완성

설명:
도서 등록 화면과 Controller, DTO, DAO 구조를 구현하였다.
현재는 데이터베이스 연동 전 단계로 화면 및 구조만 구현되어 있다.

---

## F-02 도서 목록 조회
구현 여부: 🔶 부분완성

설명:
도서 목록 화면과 Controller 연결을 구현하였다.
실제 데이터 조회 기능은 아직 구현되지 않았다.

---

## F-03 도서 대여 및 반납
구현 여부: 🔶 부분완성

설명:
대여 및 반납 기능을 위한 DTO, DAO, Controller, JSP 화면을 구현하였다.
실제 데이터 처리 기능은 추후 JDBC 연동 후 구현 예정이다.
