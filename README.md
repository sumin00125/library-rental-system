# Library Rental System

## 프로젝트 소개

Library Rental System은 JSP, Servlet, JDBC, MySQL을 활용하여 개발한 도서 대여 및 재고 관리 시스템이다.

사용자는 도서를 등록, 조회, 수정, 삭제할 수 있으며, 도서 대여 및 반납 기능을 통해 도서 상태를 관리할 수 있다.

---

## 개발 환경

### Language

* Java 11

### Database

* MySQL 8.x

### Server

* Apache Tomcat 8.5

### Build Tool

* Maven

### IDE

* Visual Studio Code

---

## 프로젝트 구조

```text
src
 └ main
    ├ java
    │  ├ controller
    │  ├ dao
    │  ├ dto
    │  └ util
    │
    └ webapp
       ├ index.jsp
       ├ bookForm.jsp
       ├ bookList.jsp
       ├ bookDetail.jsp
       ├ rentalForm.jsp
       └ rentalList.jsp
```

---

## 주요 기능

### 도서 관리

* 도서 등록
* 도서 목록 조회
* 도서 상세 조회
* 도서 수정
* 도서 삭제

### 대여 관리

* 도서 대여
* 대여 목록 조회
* 도서 반납
* 중복 대여 방지

### 데이터 관리

* MySQL 연동
* JDBC 기반 CRUD 처리

---

## 데이터베이스 구조

### Book Table

| 컬럼명       | 설명    |
| --------- | ----- |
| book_id   | 도서 번호 |
| title     | 도서명   |
| author    | 저자    |
| publisher | 출판사   |
| isbn      | ISBN  |
| category  | 카테고리  |
| quantity  | 수량    |

### Rental Table

| 컬럼명         | 설명    |
| ----------- | ----- |
| rental_id   | 대여 번호 |
| book_title  | 도서명   |
| borrower    | 대여자   |
| rental_date | 대여일   |
| return_date | 반납일   |

---

## 구현 기능

| 기능       | 구현 여부 |
| -------- | ----- |
| 도서 등록    | ✅     |
| 도서 목록 조회 | ✅     |
| 도서 상세 조회 | ✅     |
| 도서 수정    | ✅     |
| 도서 삭제    | ✅     |
| 도서 대여    | ✅     |
| 대여 목록 조회 | ✅     |
| 도서 반납    | ✅     |
| 중복 대여 방지 | ✅     |
| MySQL 연동 | ✅     |

---

## 실행 방법

1. MySQL 데이터베이스 생성
2. book, rental 테이블 생성
3. 프로젝트 Import
4. Maven Build

```bash
mvn clean package
```

5. Tomcat 실행
6. 브라우저 접속

```text
http://localhost:8080/library-rental-system-1.0.0
```

---

## 프로젝트 회고

본 프로젝트를 통해 JSP, Servlet, JDBC를 활용한 웹 애플리케이션 개발 과정을 경험할 수 있었다. MVC(Model 2) 패턴을 적용하여 유지보수성을 높였으며, MySQL 데이터베이스와 연동하여 실제 서비스 형태의 도서 관리 시스템을 구현하였다.

