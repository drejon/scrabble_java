# Use the official Maven image for building the application
FROM maven:3.9.5-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /opt/workdir

# Copy only the necessary files to resolve dependencies
COPY . .
# RUN mvn dependency:resolve

RUN mvn package -DskipTests

# Use a minimal runtime image to run the application
FROM openjdk:17-jdk-slim
WORKDIR /opt/workdir

# Copy the built JAR file from the build stage
COPY --from=build /opt/workdir/target/*.jar app.jar

# Expose the application's port
EXPOSE 8080

# Run the application
# CMD ["java", "src/main/java/Game.java"]
CMD ["java", "-jar", "app.jar"]
