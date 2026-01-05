# Connect Supabase to Spring Boot App

This project demonstrates how to connect a Supabase PostgreSQL database to a Spring Boot application using Spring Data JPA. It follows a clean layered architecture (Controller → Service → Repository → Database) and provides a simple User example.

## 🧱 Tech Stack
- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL (Supabase)
- Maven
- Hibernate

## 📂 Project Structure

```declarative

connect-supabase-to-spring-boot-app/
├── .gitattributes
├── .gitignore
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
└── src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── project/
│   │           ├── app/
│   │           │   ├── controller/
│   │           │   │   └── UserController.java
│   │           │   ├── models/
│   │           │   │   └── User.java
│   │           │   ├── repository/
│   │           │   │   └── UserRepository.java
│   │           │   └── service/
│   │           │       └── UserService.java
│   │           └── ProjectApplication.java
│   └── resources/
│       └── application.properties
└── test/
└── java/
└── com/
└── project/
└── ProjectApplicationTests.java
```


## 🚀 Features
- Connects Spring Boot to Supabase-hosted PostgreSQL
- Uses Spring Data JPA for database operations
- Clean separation of concerns
- REST API for basic user operations
- Easy configuration via `application.properties`

## 🗄️ Supabase Setup
1. Create a project at 👉 [https://supabase.com](https://supabase.com)
2. Go to **Project Settings → Database**
3. Copy the following:
    - Host
    - Database name
    - Username
    - Password
    - Port (default: 5432)
4. Create a table in Supabase

## ⚙️ Application Configuration
Update ```src/main/resources/application.properties:```

```declarative
spring.application.name=project
spring.datasource.url=jdbc:postgresql://<SUPABASE_HOST>:5432/<DATABASE_NAME>
spring.datasource.username=<DATABASE_USER>
spring.datasource.password=<DATABASE_PASSWORD>
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
