# 3. 기능 구현 및 단계별 구현내용

## 3.1 기능 구현 현황

| 요구사항 번호 | 간단 설명              | 관련 소스                                                 | 구현 여부 |
| ------- | ------------------ | ----------------------------------------------------- | ----- |
| REQ-001 | 도서 등록              | BookController.java, BookDAO.java, bookForm.jsp       | ✅ 완성  |
| REQ-002 | 도서 목록 조회           | BookDAO.java, bookList.jsp                            | ✅ 완성  |
| REQ-003 | 도서 상세 조회           | BookController.java, bookDetail.jsp                   | ✅ 완성  |
| REQ-004 | 도서 수정              | BookController.java, BookDAO.java, bookForm.jsp       | ✅ 완성  |
| REQ-005 | 도서 삭제              | BookController.java, BookDAO.java                     | ✅ 완성  |
| REQ-006 | 도서 대여              | RentalController.java, RentalDAO.java, rentalForm.jsp | ✅ 완성  |
| REQ-007 | 대여 목록 조회           | RentalDAO.java, rentalList.jsp                        | ✅ 완성  |
| REQ-008 | 도서 반납              | RentalController.java, RentalDAO.java                 | ✅ 완성  |
| REQ-009 | 중복 대여 방지           | RentalController.java, RentalDAO.java                 | ✅ 완성  |
| REQ-010 | MySQL 데이터 연동       | DBConnection.java                                     | ✅ 완성  |
| REQ-011 | Bootstrap 기반 UI 적용 | index.jsp, bookList.jsp, rentalList.jsp               | ✅ 완성  |

---

## 3.2 구현 내용 설명

### REQ-001 : 도서 등록

구현 여부: ✅ 완성

관련 소스:

* controller/BookController.java
* dao/BookDAO.java
* bookForm.jsp

설명:
사용자가 입력한 도서 정보를 받아 MySQL book 테이블에 저장하도록 구현하였다.

---

### REQ-002 : 도서 목록 조회

구현 여부: ✅ 완성

관련 소스:

* dao/BookDAO.java
* bookList.jsp

설명:
데이터베이스에 저장된 전체 도서 목록을 조회하여 화면에 출력하도록 구현하였다.

---

### REQ-003 : 도서 상세 조회

구현 여부: ✅ 완성

관련 소스:

* controller/BookController.java
* bookDetail.jsp

설명:
목록에서 선택한 도서의 상세 정보를 조회하여 별도 화면에서 출력하도록 구현하였다.

---

### REQ-004 : 도서 수정

구현 여부: ✅ 완성

관련 소스:

* controller/BookController.java
* dao/BookDAO.java
* bookForm.jsp

설명:
기존 도서 정보를 수정하고 변경된 내용을 데이터베이스에 반영하도록 구현하였다.

---

### REQ-005 : 도서 삭제

구현 여부: ✅ 완성

관련 소스:

* controller/BookController.java
* dao/BookDAO.java

설명:
선택한 도서 정보를 데이터베이스에서 삭제하도록 구현하였다.

---

### REQ-006 : 도서 대여

구현 여부: ✅ 완성

관련 소스:

* controller/RentalController.java
* dao/RentalDAO.java
* rentalForm.jsp

설명:
도서명, 대여자, 대여일 정보를 입력받아 rental 테이블에 저장하도록 구현하였다.

---

### REQ-007 : 대여 목록 조회

구현 여부: ✅ 완성

관련 소스:

* dao/RentalDAO.java
* rentalList.jsp

설명:
데이터베이스에 저장된 전체 대여 내역을 조회하여 화면에 출력하도록 구현하였다.

---

### REQ-008 : 도서 반납

구현 여부: ✅ 완성

관련 소스:

* controller/RentalController.java
* dao/RentalDAO.java

설명:
반납 버튼 클릭 시 현재 날짜를 반납일(return_date)에 저장하도록 구현하였다.

---

### REQ-009 : 중복 대여 방지

구현 여부: ✅ 완성

관련 소스:

* controller/RentalController.java
* dao/RentalDAO.java

설명:
반납되지 않은 동일 도서가 존재하는 경우 추가 대여가 불가능하도록 검증 로직을 구현하였다.

---

### REQ-010 : MySQL 데이터 연동

구현 여부: ✅ 완성

관련 소스:

* util/DBConnection.java
* dao 패키지 전체

설명:
JDBC를 활용하여 MySQL 데이터베이스와 연결하고 CRUD 기능을 수행하도록 구현하였다.

---

### REQ-011 : Bootstrap 기반 UI 적용

구현 여부: ✅ 완성

관련 소스:

* index.jsp
* bookList.jsp
* bookForm.jsp
* rentalList.jsp
* rentalForm.jsp
* bookDetail.jsp

설명:
Bootstrap 5를 적용하여 반응형 UI와 사용자 친화적인 화면 구성을 구현하였다.

