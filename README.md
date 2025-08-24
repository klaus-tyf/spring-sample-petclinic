# Spring PetClinic Sample Application

## Run Petclinic locally

Spring Petclinic is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Gradle](https://spring.io/guides/gs/gradle/). You can build a jar file and run it from the command line (it should work just as well with Java 17 or newer):

(On Windows, or if your shell doesn't expand the glob, you might need to specify the JAR file name explicitly on the command line at the end there.)

You can then access the Petclinic at <http://localhost:8080/>.

Or you can run it from Gradle directly using the Spring Boot Gradle plugin. If you do this, it will pick up changes that you make in the project immediately (changes to Java source files require a compile as well - most people use an IDE for this):

```bash
./gradlew spring-boot:run
```

> NOTE: If you prefer to use Gradle, you can build the app using `./gradlew build` and look for the jar file in `build/libs`.

