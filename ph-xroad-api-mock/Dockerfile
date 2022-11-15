# First stage
FROM nexus.riaint.ee:8500/maven:3.8-jdk-8-slim AS builder
COPY ./pom.xml pom.xml
COPY ./src src/
RUN mvn clean package

# Second stage
FROM nexus.riaint.ee:8500/eclipse-temurin:17.0.4.1_1-jre-focal
ARG JAR_FILE=target/*.jar
COPY --from=builder ${JAR_FILE} ph-xroad-api-mock.jar

USER www-data

COPY mocks /etc/mocks
ENV MOCKS_DIR=/etc/mocks/
ENV server_port=8080

ENTRYPOINT ["java", "-jar", "ph-xroad-api-mock.jar"]