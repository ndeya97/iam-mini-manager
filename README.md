# IAM Mini Manager

A personal project to simulate basic IAM (Identity and Access Management) operations. 
Built with Spring Boot and Java 17, this API supports basic identity lifecycle actions like user creation, role assignment, and revocation.

---

## 🎯 Objective

This project was designed to:
- Practice secure development in Java
- Simulate an IAM user-role API with RBAC features
- Prepare for roles in application security and IAM
- Showcase my work to Canadian employers (cybersecurity/IAM/DevSecOps)

---

## 📌 Features
- Create, view, and manage users
- Assign or revoke roles
- Logs audit actions to the console
- REST API structure

---

## 📦 Tech Stack
- Java 17
- Spring Boot
- H2 in-memory database (PostgreSQL compatible)
- RESTful API with Spring Web
- Postman for testing

---

## 🧪 Endpoints

| Method | Endpoint             | Description         |
|--------|----------------------|---------------------|
| POST   | `/users`             | Create new user     |
| GET    | `/users/{id}`        | Get user by ID      |
| POST   | `/users/{id}/roles`  | Assign a role       |
| DELETE | `/users/{id}/roles`  | Revoke a role       |
| GET    | `/users`             | List all users      |

---

## 🚀 Getting Started
```bash
git clone https://github.com/ndeya97/iam-mini-manager.git
cd iam-mini-manager
./mvnw spring-boot:run
```

---

## 🧪 Postman Collection
A Postman collection is available in this repo: iam-postman-collection.json
Import it in Postman to test the API locally on http://localhost:8080.

---

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

---

## 🔍 View H2 Console
Visit http://localhost:8080/h2-console and use JDBC URL: jdbc:h2:mem:testdb

---

## 📋 Status
🚧 Project is in progress — public to demonstrate security-oriented development skills
🔐 Future enhancements: Spring Security, audit logging endpoint, JWT

---

## 🙋‍♀️ Author
Ndeye Awa Diop  
Java & IAM Developer | PR in Canada | Google Cybersecurity Certificate (in progress)

📍 LinkedIn • GitHub