# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Development Commands

**Build and Run:**
- `./gradlew build` - Build the application
- `./gradlew bootRun` - Run the application locally (accessible at http://localhost:8080)
- `./gradlew clean` - Clean build artifacts
- `./gradlew bootJar` - Create executable JAR in build/libs/

**Testing:**
- `./gradlew test` - Run all tests
- `./gradlew check` - Run tests and all checks

**Other useful commands:**
- `./gradlew tasks` - List all available tasks
- `./gradlew dependencies` - Show project dependencies

## Architecture Overview

This is a Spring Boot 3.5.5 application using Java 21, following the classic Spring MVC pattern with JPA/Hibernate for data persistence.

**Core Architecture Layers:**
- **Controllers** (`src/main/java/.../controller/`) - REST endpoints and web controllers
- **Models/Entities** (`src/main/java/.../model/`) - JPA entities with inheritance hierarchy (BaseEntity → NamedEntity → domain objects)
- **Repositories** (`src/main/java/.../repository/`) - Spring Data JPA repositories
- **Configuration** (`src/main/java/.../config/`) - Security, caching, and web configuration

**Key Domain Entities:**
- `Owner` - Pet owners with relationships to pets
- `Pet` - Animals with types, owners, and visit history
- `Vet` - Veterinarians with specialties
- `Visit` - Medical visits linking pets to vets

**Security Configuration:**
- Form-based authentication with role-based access control
- Three predefined roles: USER, VET, ADMIN (hardcoded credentials in SecurityConfig)
- CSRF disabled, extensive security logging enabled

**Database Management:**
- Uses Liquibase for database migrations (`src/main/resources/db/liquibase/`)
- Supports H2 (default), MySQL, and PostgreSQL
- Database initialization controlled by `spring.sql.init.mode=never`
- Schema managed via Liquibase changesets, data loaded from CSV files

**Frontend:**
- Thymeleaf templates in `src/main/resources/templates/`
- Bootstrap CSS framework via WebJars
- Static resources in `src/main/resources/static/`
- SCSS compilation to CSS for styling

**Key Configuration Notes:**
- Spring Security trace logging is enabled for debugging
- Actuator endpoints exposed at `/actuator/*`
- Caching enabled with Caffeine
- Extensive validation using Bean Validation

**Testing:**
- Uses JUnit 5 with Spring Boot Test
- Testcontainers for integration testing
- Test files in `src/test/java/`