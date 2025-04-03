# Stage 1: Build the application using Gradle with JDK 17
FROM gradle:8.6.0-jdk21 AS build
WORKDIR /home/gradle/project
# Copy all project files into the build container
COPY --chown=gradle:gradle . .
# Ensure gradlew is executable and build the project (skipping tests for faster build)
RUN chmod +x gradlew && ./gradlew clean build -x test

# Stage 2: Create a lightweight runtime image with OpenJDK 17
FROM openjdk:21-jdk-slim
WORKDIR /app
EXPOSE 8080

# Copy the Spring Boot jar from the build stage (adjust the path if necessary)
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar

# ENTRYPOINT allows you to pass JAVA_OPTS at runtime for additional configuration
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]
