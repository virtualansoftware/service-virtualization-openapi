FROM arm64v8/openjdk:21-ea-21-jdk-slim

ADD target/sv-virtualan-rest-demo.jar /openapi/virtualan/virtualan-demo.jar

ENTRYPOINT ["java", "-jar", "/openapi/virtualan/virtualan-demo.jar"]
