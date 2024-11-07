FROM openjdk:17-jdk-slim

LABEL version="1.0"
LABEL description="Cards Microservice image"

COPY build/libs/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "cards-0.0.1-SNAPSHOT.jar"]
