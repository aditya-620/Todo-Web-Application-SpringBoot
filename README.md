# 📝 Todo Web Application - Spring Boot

This is a simple **Todo Web Application** built using **Spring Boot**. It allows users to manage their tasks with features like adding, updating, and deleting todos. The project leverages **Spring MVC**, **Spring Security**, **Spring Data JPA**, and an **H2 in-memory database** for fast and easy development.

---

## 🚀 Features

- 🔐 **User Authentication**: Secured login with in-memory user details via Spring Security.
- 📋 **CRUD Operations**: Create, Read, Update, and Delete todos.
- ✅ **Validation**: Form validation for cleaner user input.
- 📱 **Responsive UI**: Designed with Bootstrap for a modern and responsive layout.
- 🗃️ **In-Memory Database**: Uses H2 for rapid setup and testing.
- 📅 **Date Picker**: Bootstrap-integrated date picker for selecting target dates.

---

## 📂 Project Structure

### 📁 Controllers
- `WelcomeController`: Manages the welcome page and user session.
- `TodoControllerJpa`: Handles todo-related CRUD operations using JPA.
- `SayHelloController`: Demonstrates simple Spring MVC functionality.

### ⚙️ Services
- `TodoService`: Contains business logic for managing todos (non-JPA implementation).

### 🗃️ Repositories
- `TodoRepository`: Interface for data access using Spring Data JPA.

### 📦 Entities
- `Todo`: Represents the todo model with fields such as `id`, `username`, `description`, `targetDate`, and `done`.

---

## ✅ Prerequisites

- Java 17 or higher  
- Maven (or use the Maven Wrapper)

---

## 🛠️ Getting Started

### 1. Clone the Repository

```bash
git clone <repository-url>
cd Todo-Web-Application-SpringBoot
```

### 2. Build the Project
```bash
./mvnw clean install
```

### 3. Run the Application  
```bash
./mvnw spring-boot:run
```

- Maven (or use the Maven Wrapper)

---

## 🌐 Application Endpoints

### 🔓 Public Endpoints

- `GET /say-hello`  
  Returns a simple `"Hello"` message.

- `GET /say-hello-html`  
  Returns a basic HTML page.

- `GET /say-hello-jsp`  
  Renders a JSP page.

---

### 🔐 Secured Endpoints (require login)


- `GET /`  
  Welcome page after login.

- `GET /list-todos`  
  View the list of todos.

- `GET /add-todo`  
  Add a new todo item.

- `POST /update-todo?id={id}`  
  Update an existing todo with the specified ID.

- `POST /delete-todo?id={id}`  
  Delete a todo with the specified ID.

---

## 💾 Database

This application uses an **H2 in-memory database** for development and testing.

- **H2 Console:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

## 🧰 Technologies Used

- **Spring Boot** – Core framework
- **Spring MVC** – Web layer and controller routing
- **Spring Security** – Handles authentication and authorization
- **Spring Data JPA** – ORM and data persistence abstraction
- **H2 Database** – Lightweight in-memory DB for quick development
- **Bootstrap** – Frontend styling and responsive design
- **JSP** – View rendering on the server side

---

## ⚙️ Configuration

### `application.properties`

```properties
# View resolver settings
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp

# H2 database configuration
spring.datasource.url=jdbc:h2:mem:testdb

# Date formatting
spring.mvc.format.date=yyyy-MM-dd
---
## 🧪 Running Tests

To run all tests, use the following command:

```bash
./mvnw test
```
---
## 📁 Folder Structure
```
Todo-Web-Application-SpringBoot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.adityarastogi.springboot.Todo_Web_Application_SpringBoot/
│   │   │       ├── todo/               # Todo-related logic
│   │   │       ├── login/              # Login and welcome logic
│   │   │       ├── hello/              # Basic Spring MVC examples
│   │   │       └── security/           # Spring Security configuration
│   │   ├── resources/
│   │   │   ├── META-INF/resources/WEB-INF/jsp/  # JSP views
│   │   │   ├── application.properties          # App config
│   │   │   └── data.sql                        # Initial data
│   └── test/                                   # Unit tests
├── pom.xml                                     # Maven config
└── README.md                                   # Project documentation
```
---
## 📬 Contact

- Feel free to open an issue or submit a pull request if you find bugs or want to contribute improvements!
---