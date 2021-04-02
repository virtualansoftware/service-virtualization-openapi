FROM adoptopenjdk/openjdk8:alpine-slim

ADD target/virtualan-rests-demo.jar /openapi/virtualan/virtualan-demo.jar

ENTRYPOINT ["java", "-jar", "/openapi/virtualan/virtualan-demo.jar"] 
