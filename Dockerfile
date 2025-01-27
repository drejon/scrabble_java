# Use official Gradle image (with OpenJDK pre-installed)
FROM gradle:7.3-jdk17 as base

RUN apt-get update && apt-get install -y entr

# Create an app directory inside the container
WORKDIR /opt/workdir

# Copy Gradle files into the container
COPY build.gradle /opt/workdir/

# Copy source code into the container
COPY ./src /opt/workdir/src

# Run Gradle to build the application
RUN gradle build

# Command to compile and run the Java app (Game class)
CMD ["java", "-cp", "build/classes/java/main", "Game"]
