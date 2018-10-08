*Step 1)* Create the Application.properties with following information in the "src/main/resources" directory:

     > virtualan.datasource.driver-class-name=org.hsqldb.jdbcDriver
     > virtualan.datasource.jdbcurl=jdbc:hsqldb:mem:dataSource
     > virtualan.datasource.username=sa
     > virtualan.datasource.password=

*Step 2)* Add the following entry for each Interface Spec/Yaml and need to be a Mock/Virtulized service 

		<configuration>
			<inputSpec>${project.basedir}/src/main/resources/external/petstore.yaml</inputSpec>
			<output>${project.basedir}/target/external/</output>
			<apiPackage>org.openapitools.virtualan.api</apiPackage>
			<modelPackage>org.openapitools.virtualan.to</modelPackage>
			<generatorName>spring</generatorName>
			<configOptions>	
				<virtualService>true</virtualService>
            </configOptions>
		</configuration>
	
*Step 3)* 
	Build and deploy. 
	         Your virtualized service is ready :)

*Step 4)* 
      Navigate to the http://localhost:8080/virtualan-ui.html and check the service

*Step 5)* 
     To set up mock data:

- Using Virtualan-UI:       
	https://github.com/elan-venture/virtualan/wiki/Test-Data-Set-up-using-Virtualan

- Using Virtualan-Rest service:
	https://github.com/elan-venture/virtualan/blob/master/test/virtualan-test-data/src/main/resources/features/pet/pet.feature
	https://github.com/elan-venture/virtualan/tree/master/samples/virtualan-openapi-spring-mapping/src/test/java/io/virtualan/test
