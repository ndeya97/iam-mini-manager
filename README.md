# IAM Mini Manager

This is a simple IAM (Identity and Access Management) API built with Spring Boot and Java 17. It supports basic identity lifecycle features like user creation, role assignment, and revocation.

## 📌 Features
- Create, view, and manage users
- Assign or revoke roles
- Logs audit actions to the console
- REST API structure

## 📦 Tech Stack
- Java 17
- Spring Boot
- H2 in-memory database (PostgreSQL compatible)
- RESTful API with Spring Web

## 🚀 Getting Started
```bash
git clone https://github.com/ndeyeawadiop/iam-mini-manager.git
cd iam-mini-manager
./mvnw spring-boot:run
```

## 📬 Sample Requests (Postman)

### Create User
POST /users
```json
{
  "username": "awa.diop",
  "email": "awa@example.com"
}
```

### Assign Role
POST /users/1/roles
```json
{
  "role": "admin"
}
```

### Revoke Role
DELETE /users/1/roles

## 🔍 View H2 Console
Visit http://localhost:8080/h2-console and use JDBC URL: jdbc:h2:mem:testdb

## 🙋 Author
Ndeye Awa Diop  
Java & IAM Developer | PR in Canada | Google Cybersecurity Certificate (in progress)
