FROM openjdk:16-ea-23-jdk-oraclelinux8

ADD target/virtualan-rests-demo.jar /openapi/virtualan/virtualan-demo.jar

ENTRYPOINT ["java", "-jar", "/openapi/virtualan/virtualan-demo.jar"] 
