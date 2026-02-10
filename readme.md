##  Task Management System – Spring Boot REST API

- A Task Management System built using Spring Boot that provides RESTful APIs for managing users, tasks, categories, and priorities.
- The application follows clean architecture, uses DTO-based API contracts, and includes global exception handling and Swagger (OpenAPI 3) documentation.

## Features

- User management (create, view users)

- Task creation, update, and retrieval

- Category management

- Priority management
- Task status tracking (PENDING, IN_PROGRESS, DONE)

- DTO-based request/response design

- Centralized global exception handling

- Swagger UI for API documentation

- Layered architecture (Controller → Service → Repository)

## Tech Stack
| Layer                 | Technology                      |
| --------------------- |---------------------------------|
| Backend               | Spring Boot                     |
| Language              | Java                            |
| ORM                   | Spring Data JPA (Hibernate)     |
| Database              | PostgreSql                      |
| API Documentation     | Swagger (OpenAPI 3 – springdoc) |
| Build Tool            | Maven                           |
| Boilerplate Reduction | Lombok                          |


## Project Structure

```aiignore
src/main/java/com/gevernova/Task_management_system
│
├── controller
│   ├── UserController.java
│   ├── TaskController.java
│   ├── CategoryController.java
│   └── PriorityController.java
│
├── service
│   ├── UserService.java
│   ├── TaskService.java
│   ├── CategoryService.java
│   └── PriorityService.java
│
├── repository
│   ├── UserRepository.java
│   ├── TaskRepository.java
│   ├── CategoryRepository.java
│   └── PriorityRepository.java
│
├── model
│   ├── User.java
│   ├── Task.java
│   ├── Category.java
│   └── Priority.java
│
├── DTO
│   ├── UserRequest.java
│   ├── UserDTO.java
│   ├── TaskRequest.java
│   ├── TaskResponse.java
│   ├── TaskSummaryDTO.java
│   ├── CategoryRequest.java
│   ├── CategoryDTO.java
│   ├── PriorityRequest.java
│   └── PriorityDTO.java
│
├── exception
│   ├── UserNotFoundException.java
│   ├── TaskNotFoundException.java
│   ├── CategoryNotFoundException.java
│   ├── PriorityNotFoundException.java
│   └── GlobalExceptionHandler.java
│
└── TaskManagementSystemApplication.java

```

## Domain Model
### User

- id

- name

- email

## Task

- id

- title

- description

- status (PENDING, IN_PROGRESS, DONE)

- user (Many-to-One)

- category (Many-to-One)

- priority (Many-to-One)

## Category

- id

- name

## Priority

- id

- level

## DTO Design
### Request DTOs

- Accept only required data and IDs

- Avoid exposing JPA entities

### Example:
```aiignore
{
  "title": "Complete Swagger Integration",
  "description": "Add OpenAPI documentation",
  "status": "IN_PROGRESS",
  "userId": 1,
  "categoryId": 2,
  "priorityId": 3
}

```
## Response DTOs

- Return structured, nested data
- Prevent entity leakage

## API Endpoints
### User APIs
| Method | Endpoint      | Description    |
| ------ | ------------- | -------------- |
| POST   | `/users`      | Create user    |
| GET    | `/users/{id}` | Get user by ID |
| GET    | `/users`      | Get all users  |


### Task APIs
| Method | Endpoint      | Description    |
| ------ | ------------- | -------------- |
| POST   | `/tasks`      | Create task    |
| GET    | `/tasks/{id}` | Get task by ID |
| GET    | `/tasks`      | Get all tasks  |
| PUT    | `/tasks/{id}` | Update task    |
| DELETE | `/tasks/{id}` | Delete task    |

### Category APIs
| Method | Endpoint      | Description        |
| ------ | ------------- | ------------------ |
| POST   | `/categories` | Create category    |
| GET    | `/categories` | Get all categories |


## Priority APIs
| Method | Endpoint      | Description        |
| ------ | ------------- | ------------------ |
| POST   | `/priorities` | Create priority    |
| GET    | `/priorities` | Get all priorities |


## Exception Handling

### Custom exceptions for domain errors:

- UserNotFoundException

- TaskNotFoundException

- CategoryNotFoundException

- PriorityNotFoundException
 
- Centralized handling using @ControllerAdvice

- Meaningful HTTP status codes and error messages


## Swagger / OpenAPI Documentation

### Swagger UI is enabled using springdoc-openapi.

### Access Swagger UI
```aiignore
http://localhost:8080/swagger-ui/index.html
```

## Configuration

### Update database configuration in:
```aiignore
src/main/resources/application.properties
```
### Example
```aiignore
spring.datasource.url=jdbc:mysql://localhost:3306/task_db
spring.datasource.username=root
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
## Running the Application
### Prerequisites

- Java 17+

- Maven

- PostgreSql
```aiignore
mvn spring-boot:run
```

## Testing

### We can test APIs using:

- Swagger UI

- Postman

## Author
### Jay Vardhan Vashishtha
(Backend Developer | Spring Boot | REST APIs)
