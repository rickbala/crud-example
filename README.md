To install the application: mvn install
To run the application: mvn spring-boot:run
If maven isn't installed, just type .mvnw instead of mvn.
To run it with docker: docker build -t rickbala/myapp . && docker run -p 8080:8080 rickbala/myapp
Access localhost:8080 on your browser for a CRUD
Access localhost:8080/users on your browser for the API
