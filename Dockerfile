FROM openjdk:8-jre-alpine

ADD target/virtualan-demo.jar /openapi/virtualan/virtualan-demo.jar

ENTRYPOINT ["java", "-jar", "/openapi/virtualan/virtualan-demo.jar"] 
