FROM openjdk:17.0.2-slim-buster
ADD target/sv-virtualan-rest-demo.jar /openapi/virtualan/virtualan-demo.jar

ENTRYPOINT ["java", "-jar", "/openapi/virtualan/virtualan-demo.jar"]
