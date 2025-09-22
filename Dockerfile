FROM openjdk:17-oracle
LABEL maintainer="asset"
COPY build/libs/middle02main-sevice-0.0.1-SNAPSHOT.jar service.jar
ENTRYPOINT ["java", "-jar", "service.jar"]
