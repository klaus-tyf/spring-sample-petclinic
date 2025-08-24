# Project Overview

This is a Spring Boot application that provides a simple web interface for managing a pet clinic. It allows users to view and manage information about veterinarians, pet owners, and their pets.

**Key Technologies:**

*   **Backend:** Spring Boot, Spring MVC, Spring Data JPA, Spring Security
*   **Frontend:** Thymeleaf, Bootstrap, Font Awesome
*   **Database:** H2 (in-memory), MySQL, PostgreSQL (configurable)
*   **Build:** Gradle
*   **Database Migrations:** Liquibase

**Architecture:**

The application follows a standard Model-View-Controller (MVC) architecture.

*   **Controllers:** Handle web requests and interact with the service layer.
*   **Models:** Represent the application's data (e.g., Owner, Pet, Vet).
*   **Views:** Render the user interface using Thymeleaf templates.
*   **Repositories:** Provide data access using Spring Data JPA.

**Structure:**
*   **src/main/java:** Contains the Java source code.
*   **src/main/resources:** Contains application properties, Thymeleaf templates, static resources (CSS, JS), and Liquibase changelogs.
*   **src/java/org/springframework/samples/petclinic/config:** Configuration classes for the application.
*   **src/java/org/springframework/samples/petclinic/model:** Domain models representing entities.
*   **src/java/org/springframework/samples/petclinic/repository:** Data access layer.
*   **src/java/org/springframework/samples/petclinic/service:** Business logic layer.
*   **src/java/org/springframework/samples/petclinic/web:** Web controllers.
*  **src/test/java:** Contains unit and integration tests.

**Rules and Conventions:**
* Each endpoint must have Integration tests.
* Each service method should have Integration tests.

# Building and Running

## Running the application

You can run the application from the command line using the Spring Boot Gradle plugin:

```bash
./gradlew spring-boot:run
```

The application will be accessible at <http://localhost:8080/>.

## Building the application

To build the application, run the following command:

```bash
./gradlew build
```

The compiled JAR file will be located in the `build/libs` directory.

## Testing the application

To run the tests, use the following command:

```bash
./gradlew test
```

# Development Conventions

*   **Code Style:** The project follows standard Java coding conventions.
*   **Testing:** The project uses JUnit 5 for testing. Tests are located in the `src/test/java` directory.
*   **Database Migrations:** Database changes are managed using Liquibase. Changelogs are located in the `src/main/resources/db/liquibase/changelog` directory.
