FROM openjdk:21
WORKDIR /app
COPY target/WS-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "/app/WS-0.0.1-SNAPSHOT.jar"]
