Step 1) Create the Application.properties with following information:

springfox.documentation.swagger.v2.path=/api-docs
server.port=8080
spring.jackson.date-format=org.openapitools.RFC3339DateFormat
spring.jackson.serialization.WRITE_DATES_AS_TIMESTAMPS=false
virtual.datasource.driver-class-name=org.hsqldb.jdbcDriver
virtual.datasource.jdbcurl=jdbc:hsqldb:mem:dataSource
virtual.datasource.username=sa
virtual.datasource.password=

Step 1) Create the Application.properties with following information:
	Download the pom.xml from the following location:
		1)  Add the following entry for each Yaml you would like to set up Mock/Virtulized service
					 <configuration>
							<inputSpec>${project.basedir}/src/main/resources/external/petstore.yaml</inputSpec>
							<output>${project.basedir}/target/external/</output>
							<apiPackage>org.openapitools.virtualan.api</apiPackage>
							<modelPackage>org.openapitools.virtualan.to</modelPackage>
							<virtualService>true</virtualService>
							<generatorName>spring</generatorName>
						</configuration>
		2) Build and deploy. 
		
Step 3) 
	Your service is ready :)

Step 4) Navigate to the http://localhost:8080/virtualan-ui.html and check the service
