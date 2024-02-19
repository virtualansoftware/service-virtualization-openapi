FROM openjdk:17-slim

ADD target/sv-virtualan-rest-demo.jar /openapi/virtualan/virtualan-demo.jar

ENTRYPOINT ["java", "-jar", "/openapi/virtualan/virtualan-demo.jar"]
