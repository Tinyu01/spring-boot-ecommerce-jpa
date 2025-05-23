# My Spring Boot Application

This project is a Spring Boot application that provides a basic structure for a web application with user authentication, product management, and admin functionalities.

## Project Structure

```
my-springboot-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org
│   │   │       └── amazon
│   │   │           └── example
│   │   │               ├── config
│   │   │               │   ├── PasswordConfig.java
│   │   │               │   └── SecurityConfig.java
│   │   │               ├── controller
│   │   │               │   ├── AdminController.java
│   │   │               │   ├── HomeController.java
│   │   │               │   ├── LoginController.java
│   │   │               │   ├── ProductController.java
│   │   │               │   ├── RegistrationController.java
│   │   │               │   └── WelcomeController.java
│   │   │               ├── entity
│   │   │               │   ├── Product.java
│   │   │               │   └── User.java
│   │   │               ├── repository
│   │   │               │   └── ProductRepository.java
│   │   │               ├── service
│   │   │               │   ├── ProductService.java
│   │   │               │   ├── UserService.java
│   │   │               │   └── WelcomeService.java
│   │   │               └── ExampleApplication.java
│   │   └── resources
│   │       ├── templates
│   │       │   ├── login.html
│   │       │   ├── register.html
│   │       │   └── welcome.html
│   │       ├── application.properties
│   │       ├── application-dev.properties
│   │       └── application-prod.properties
│   └── test
│       └── java
│           └── org
│               └── amazon
│                   └── example
│                       └── ExampleApplicationTests.java
├── .gitignore
├── pom.xml
├── README.md
└── LICENSE
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd my-springboot-app
   ```

2. **Build the project:**
   ```
   mvn clean install
   ```

3. **Run the application:**
   ```
   mvn spring-boot:run
   ```

4. **Access the application:**
   Open your web browser and navigate to `http://localhost:8080`.

## Usage

- **Login:** Navigate to the login page to authenticate users.
- **Registration:** New users can register through the registration page.
- **Product Management:** Admins can manage products through the admin interface.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.