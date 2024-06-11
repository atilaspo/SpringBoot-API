
# SpringBoot-API

SpringBoot-API is a RESTful web service built with Spring Boot. This API serves as a template for creating and managing student resources using standard HTTP methods.

## Project Structure

- **Folders**:
    - `/src/main/java/com/cursitospring/springboot/student`: Package containing the student-related application logic.
    - `/src/main/resources`: Resources folder containing application configuration files.

- **Files**:
    - `SpringBootApiApplication.java`: Main entry point of the Spring Boot application.
    - `application.properties`: Configuration file for the application.
    - `pom.xml`: Maven configuration file that includes dependencies and build configuration.
    - `/src/main/java/com/cursitospring/springboot/student`:
        - `Student.java`: Entity representing the Student model.
        - `StudentConfig.java`: Configuration class for initializing data.
        - `StudentController.java`: REST controller for handling student-related HTTP requests.
        - `StudentRepository.java`: Repository interface for Student entity.
        - `StudentService.java`: Service class for business logic related to students.

## Endpoints

The API provides the following endpoints:

- **GET /api/v1/student**: Retrieve a list of students.
- **POST /api/v1/student**: Register a new student.
- **DELETE /api/v1/student/{studentId}**: Delete a student by ID.
- **PUT /api/v1/student/{studentId}**: Update a student's details by ID.

## Example Usage

### Get All Students

```bash
curl -X GET http://localhost:8080/api/v1/student
```

### Register a New Student

```bash
curl -X POST http://localhost:8080/api/v1/student -H "Content-Type: application/json" -d '{"name":"John Doe", "email":"john.doe@example.com", "dob":"2000-01-01"}'
```

### Delete a Student

```bash
curl -X DELETE http://localhost:8080/api/v1/student/1
```

### Update a Student

```bash
curl -X PUT http://localhost:8080/api/v1/student/1 -d "name=Jane Doe&email=jane.doe@example.com"
```

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/atilaspo/SpringBoot-API.git
   cd SpringBoot-API
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## Configuration

Edit the `src/main/resources/application.properties` file with your database and application configuration.

## Running the Application

Use Maven to run the Spring Boot application:

```bash
mvn spring-boot:run
```

Alternatively, you can build the project and run the generated JAR file:

```bash
mvn clean package
java -jar target/SpringBoot-API-0.0.1-SNAPSHOT.jar
```

## Usage

Once the application is running, you can access the API at `http://localhost:8080/api/v1/student`.

Use tools like Postman or cURL to interact with the endpoints.

## Contribution

If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/new-feature`).
3. Make your changes and commit them (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/new-feature`).
5. Open a Pull Request.

## Contact

- **Author:** Santiago Ortiz
- **Email:** ortizsantiagopablo@gmail.com
- **GitHub:** [atilaspo](https://github.com/atilaspo)
