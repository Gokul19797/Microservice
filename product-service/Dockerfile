# Use an official openjdk image as a base image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/product-service-0.0.1.jar app.jar

# Expose the port your Spring Boot app runs on (default is 8080)
EXPOSE 8083

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
