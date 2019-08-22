To install the application: mvn install
To run the application: mvn spring-boot:run
If maven isn't installed, just type ./mvnw instead of mvn.
To run it with docker: docker build -t rickbala/crud-example . && docker run -p 8080:8080 rickbala/crud-example
To run it with pure Java: java -jar target/*.jar
To run it inside a webserver (Weblogic,Tomcat,etc): change the packaging in pom.xml from jar to war, then mvn clean install, and then grab the generated target/*.war file for deployment
Access localhost:8080 on your browser for a CRUD
Access localhost:8080/users on your browser for the API
