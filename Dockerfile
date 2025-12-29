# Use Eclipse Temurin (official OpenJDK replacement) - Java 17
FROM eclipse-temurin:17-jdk-jammy

# Set working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR into the container
COPY target/MVC_Crud_h2database-0.0.1-SNAPSHOT.jar app.jar

# Expose the port used by Spring Boot
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
