# 프로젝트 소개

## 프로젝트명

도서 대여 및 재고 관리 시스템 (Library Rental System)

---

## 프로젝트 개요

본 프로젝트는 JSP, Servlet, JDBC, MySQL을 활용하여 개발한 웹 기반 도서 관리 시스템이다.

사용자는 등록된 도서를 조회하고 상세 정보를 확인할 수 있으며, 관리자는 도서 등록, 수정, 삭제 기능을 수행할 수 있다. 또한 도서 대여 및 반납 기능을 통해 도서의 대여 상태를 관리할 수 있으며, 이미 대여 중인 도서에 대해서는 중복 대여를 방지하도록 구현하였다.

MVC(Model 2) 패턴을 적용하여 유지보수성과 확장성을 고려한 구조로 설계하였다.

---

## 팀원

| 이름  | 학번       | 역할                               |
| --- | -------- | -------------------------------- |
| 최수민 | 20230587 | JSP/Servlet 구현, 기능 개발, GitHub 관리 |
| 정유승 | 20230608 | DB 설계, UI 구현 및 문서 정리             |

---

## 기술 스택

### Backend

* Java 11
* JSP
* Servlet
* JDBC

### Database

* MySQL

### Frontend

* HTML
* CSS
* JavaScript
* Bootstrap 5

### Server

* Apache Tomcat 8.5

### Build Tool

* Maven

### Version Control

* Git
* GitHub

---

## 개발 플랫폼

본 프로젝트는 웹프로그래밍 수업의 요구사항에 따라 JSP, Servlet, JDBC 기반 MVC 구조로 개발하였다.

* Language : Java
* View : JSP
* Controller : Servlet
* Database Access : JDBC
* Database : MySQL
* Build Tool : Maven
* Server : Apache Tomcat
* Architecture : MVC Pattern

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
* 도서 반납
* 대여 상태 조회
* 중복 대여 방지

### 데이터 관리

* MySQL 연동
* JDBC 기반 CRUD 처리

---

## 실행 방법

1. Repository Clone
2. MySQL 데이터베이스 생성
3. book 테이블 생성
4. rental 테이블 생성
5. Maven Build

```bash
mvn clean package
```

6. Apache Tomcat 실행
7. 웹 브라우저 접속

```text
http://localhost:8080/library-rental-system-1.0.0
```

---

## 기대 효과

* 도서 정보를 효율적으로 관리할 수 있다.
* 대여 및 반납 상태를 쉽게 확인할 수 있다.
* 웹 기반 CRUD 시스템 구현 경험을 습득할 수 있다.
* MVC 패턴과 JDBC 활용 능력을 향상시킬 수 있다.

---

## AI 활용 내역

* 프로젝트 개요 문서 작성 보조
* 요구사항 분석 및 설계 문서 초안 작성
* JSP/Servlet 구조 설계 보조
* JDBC 코드 작성 및 오류 해결 지원
* README 및 프로젝트 문서 작성 지원
