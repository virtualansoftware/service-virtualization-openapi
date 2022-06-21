<h1 align="center" > Virtualan </h1>

[![Maven Central](https://img.shields.io/maven-central/v/io.virtualan/virtualan-plugin.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.virtualan%22%20AND%20a:%22virtualan-plugin%22) [![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fvirtualansoftware%2Fservice-virtualization-openapi.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fvirtualansoftware%2Fservice-virtualization-openapi?ref=badge_shield)
 [![Build Status](https://travis-ci.com/virtualansoftware/service-virtualization-openapi.svg?branch=master)](https://travis-ci.com/virtualansoftware/service-virtualization-openapi)

> Virtualan is an open source-based Open API Interface driven, Kafka, AMQ and MQTT Service virtualization product. It supports #OpenAPI, #AsyncAPI test development. This supports #shiftleft testing.

**Product page:** https://www.linkedin.com/products/virtualan-software-virtualan/

**Tutorials:**  https://tutorials.virtualan.io/#/Virtualan

**Example:**  https://github.com/virtualansoftware/service-virtualization-openapi

**Video:**  https://www.youtube.com/watch?v=otTjbPxT0W8 

**Docker Image:**  https://hub.docker.com/r/virtualan/service-virtualization  



*II. Initial Set up your project for the Swagger Specification* :

- Why/How to store the mock data in the centralized place:
	It always provides a choice to choose your data base and configure(spring-jpa). Need to provide data base information in the Application.properties in the "src/main/resources" directory of your spring boot application: This would requires if you don't want to loose the existing mock data because as you redeploy the code the data would be lost.

- In memory DB: (Eveny restart you lose the old data)
	
	- virtualan.datasource.driver-class-name=org.hsqldb.jdbcDriver
	- virtualan.datasource.jdbcurl=jdbc:hsqldb:mem:dataSource
	- virtualan.datasource.username=sa
	- virtualan.datasource.password=
     
- Add the following entry for each Interface Spec/Yaml  to be set up as mock service:
	- to setup  "petstore.yaml" need to add following entry in the pom.xml. refer the pom.xml for reference
	
	```html
	<execution>
		<id>pet-service-vs-api</id>
		<goals>
			<goal>generate</goal>
		</goals>
		<configuration>
			<inputSpec>${project.basedir}/src/main/resources/META-INF/resources/yaml/PetStore/petstore.yaml</inputSpec>
			<output>${project.basedir}/target/external/</output>
			<apiPackage>org.openapitools.virtualan.api</apiPackage>
			<modelPackage>org.openapitools.virtualan.to</modelPackage>
			<generatorName>spring</generatorName>
			<configOptions>
                                <virtualService>true</virtualService>
                        </configOptions>
		</configuration>
	</execution>
	```

*III. Navigate to root directory of the folder where pom.xml was present*:

- Build:

         - mvn clean install  
	 
	 - If you have any proxy issue use this command:  mvn -Dhttps.protocols=TLSv1,TLSv1.1,TLSv1.2 clean install 
                  
- Run using standalone JAR:
	
	- java -jar target/virtualan-pet.jar         

- To set up  data:
      
      - Using Virtualan-UI:       
      	https://github.com/virtualansoftware/virtualan/wiki/Test-Data-Set-up-using-Virtualan
      
      - open API Contract: 
        https://github.com/virtualansoftware/virtualan/blob/master/modules/virtualan-plugin/src/main/resources/virtualservices.yaml
	
    
      - Using Virtualan-Rest service: for automation usecases
        https://github.com/virtualansoftware/virtualan-openapi-demo/blob/master/src/test/resources/features/demo/demo.feature
	
	
	
- Invoke Virtualan UI:  			
	- Navigate to http://localhost:8080/virtualan-ui.html 
	- More details about the user interface refer: https://github.com/virtualansoftware/virtualan/wiki 


## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fvirtualansoftware%2Fservice-virtualization-openapi.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Fvirtualansoftware%2Fservice-virtualization-openapi?ref=badge_large)