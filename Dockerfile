FROM adoptopenjdk/openjdk11:alpine-slim

ADD target/sv-virtualan-rest-demo.jar /openapi/virtualan/virtualan-demo.jar

ENTRYPOINT ["java", "-Dspringdoc.swagger-ui.queryConfigEnabled=false", "-jar", "/openapi/virtualan/virtualan-demo.jar"] 
