# Product Management Application

A RESTful API built with Spring Boot for managing product inventory. This project demonstrates my transition to Java/Spring ecosystem and showcases modern backend development practices.

## Project Overview

This application provides a complete CRUD (Create, Read, Update, Delete) API for product management, featuring:
- RESTful API endpoints for product operations
- MySQL database integration with JPA/Hibernate
- Input validation and error handling
- Clean architecture with separation of concerns
- Professional logging and transaction management

## Tech Stack

- **Framework**: Spring Boot 4.0.0-SNAPSHOT
- **Language**: Java 21
- **Database**: MySQL 8.0
- **ORM**: JPA/Hibernate
- **Build Tool**: Maven
- **Libraries**:
  - Spring Data JPA
  - Spring Boot Validation
  - Lombok (for boilerplate reduction)
  - SLF4J (for logging)

## Architecture

The application follows a layered architecture pattern:

```
├── controller/     # REST API endpoints
├── service/        # Business logic layer
├── repository/     # Data access layer
└── model/          # Entity/Domain models
```

### Key Components

- **ProductController**: RESTful endpoints for product operations
- **ProductServiceImpl**: Business logic implementation
- **ProductRepository**: JPA repository for database operations
- **Product**: Entity model with validation annotations

## Features

### API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/products/all` | Retrieve all products |
| GET | `/api/products/{id}` | Get product by ID |
| POST | `/api/products` | Create new product |
| PUT | `/api/products/{id}` | Update existing product |
| DELETE | `/api/products/{id}` | Delete product |

### Product Model

```java
{
  "id": 1,
  "name": "Product Name",
  "description": "Product Description",
  "price": 99.99,
  "quantity": 50
}
```

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+
- MySQL 8.0+

### Database Setup

1. Create a MySQL database:
```sql
CREATE DATABASE productdb;
```

2. Update `application.properties` with your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Installation & Running

1. Clone the repository:
```bash
git clone [your-repo-url]
cd ProductApp
```

2. Install dependencies:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8090`

## API Usage Examples

### Create a Product
```bash
curl -X POST http://localhost:8090/api/products \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Laptop",
    "description": "Gaming laptop with RTX 4070",
    "price": 1299.99,
    "quantity": 10
  }'
```

### Get All Products
```bash
curl http://localhost:8090/api/products/all
```

### Update a Product
```bash
curl -X PUT http://localhost:8090/api/products/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Updated Laptop",
    "price": 1199.99,
    "quantity": 15
  }'
```

## Configuration

### Application Properties
- **Port**: 8090
- **Database**: MySQL with automatic schema updates
- **JPA**: Hibernate DDL set to `update` mode

### Validation Rules
- Product name is required and must be unique
- Automatic ID generation using database identity strategy
- Price stored as BigDecimal for precision

## Learning Journey

This project represents my transition from [previous tech stack] to Java/Spring Boot. Key learning areas covered:

- **Spring Framework**: Dependency injection, auto-configuration
- **Spring Boot**: Rapid application development, embedded server
- **Spring Data JPA**: Repository pattern, query methods
- **Bean Validation**: Input validation with annotations
- **Maven**: Build automation and dependency management
- **Lombok**: Code generation for cleaner models
- **RESTful Design**: HTTP methods, status codes, resource naming

## Future Enhancements

- [ ] Exception handling with custom error responses
- [ ] API documentation with OpenAPI/Swagger
- [ ] Unit and integration testing
- [ ] Security with Spring Security
- [ ] Pagination and sorting for product listing
- [ ] Search and filtering capabilities
- [ ] Docker containerization
- [ ] CI/CD pipeline setup

## What I Learned

- **Spring Boot Magic**: Auto-configuration and convention over configuration
- **JPA Relations**: Entity mapping and database relationships
- **Repository Pattern**: Clean data access abstraction
- **Validation**: Server-side validation with Bean Validation API
- **Transaction Management**: @Transactional for data consistency
- **Lombok Benefits**: Reduced boilerplate code with annotations

## Contributing

This is a learning project, but feedback and suggestions are welcome! Feel free to:
- Open issues for bugs or improvements
- Submit pull requests with enhancements
- Share feedback on code structure and best practices


---

*This project demonstrates my commitment to continuous learning and adapting to new technologies in the Java ecosystem.*
