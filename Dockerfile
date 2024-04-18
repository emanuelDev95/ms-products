FROM openjdk:17-jdk-alpine

VOLUME /tmp
COPY /target/ms-products-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD["java", "-jar", "ms-products-0.0.1-SNAPSHOT.jar"]