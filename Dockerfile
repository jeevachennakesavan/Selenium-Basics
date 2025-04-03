# Use an official Java 11 runtime as the base image
FROM maven:3.8.6-openjdk-11

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:resolve

# Copy the source code into the container
COPY src/ src/

# Run the Maven build (excluding tests for now)
RUN mvn clean install -DskipTests

# Run Selenium tests
CMD ["mvn", "test"]
