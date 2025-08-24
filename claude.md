# Spring PetClinic - Claude Code Documentation

## Project Overview

Spring PetClinic is a sample Java Spring Boot application demonstrating modern web application development. This is a reference application for learning Spring Boot, MVC, and JPA/Hibernate.

**Tech Stack:**
- Java 17+
- Spring Boot 3.5.0
- Spring MVC, Spring Data JPA
- Thymeleaf (templating)
- H2/MySQL/PostgreSQL databases
- Maven/Gradle build tools

## Key Project Structure

\`\`\`
spring-petclinic-main/
├── src/main/java/org/springframework/samples/petclinic/
│   ├── model/     # Base entities
│   ├── owner/     # Owner, Pet, Visit domain
│   ├── vet/       # Veterinarian domain
│   └── system/    # System components
├── src/main/resources/
│   ├── application*.properties
│   ├── db/        # Database scripts
│   ├── templates/ # Thymeleaf HTML
│   └── static/    # CSS, JS, images
├── pom.xml        # Maven config
└── build.gradle   # Gradle config
\`\`\`

## Quick Start Commands

### Maven
\`\`\`bash
./mvnw clean package
./mvnw spring-boot:run
./mvnw test
\`\`\`

### Gradle
\`\`\`bash
./gradlew build
./gradlew bootRun
./gradlew test
\`\`\`

## Key URLs
- Home: http://localhost:8080/
- Find Owners: http://localhost:8080/owners/find
- Vets: http://localhost:8080/vets

## Core Entities
- Owner - Pet owners
- Pet - Pets owned
- PetType - Dog, cat, etc.
- Visit - Vet appointments
- Vet - Veterinarians
- Specialty - Vet specializations

## Key Controllers
- OwnerController - Owner CRUD
- PetController - Pet management
- VisitController - Appointments
- VetController - Vet listings

## Database Profiles
- Default: H2 in-memory
- MySQL: --spring.profiles.active=mysql
- PostgreSQL: --spring.profiles.active=postgres

## Claude Code Usage Tips

Ask Claude Code to:
1. Add new features (e.g., appointment scheduling)
2. Fix bugs or issues
3. Write unit tests
4. Refactor code
5. Add REST APIs
6. Improve UI/UX
7. Optimize performance
8. Add security features

Example requests:
- "Add pet vaccination tracking"
- "Create REST API for mobile app"
- "Add user authentication"
- "Write tests for OwnerController"
- "Optimize database queries"

## Important Files
- pom.xml / build.gradle - Dependencies
- application.properties - Config
- OwnerController.java - MVC example
- Owner.java - JPA entity example

---
*Optimized for Claude Code - mention specific components when asking for help*
