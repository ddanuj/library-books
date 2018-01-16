# library-books
Sample application - Spring Boot, REST, Hibernate JPA, MySQL

This is a code sample demonstrating basic CRUD operations for a Book keeping system.
It has following components:
1. MySQL database - To store book information.
2. Hibernate JPA - Communication to the data layer done via JPA annotations.
3. Spring controller - To expose APIs for CRUD operations.
4. Spring Boot - To package and run the applicaiton in self contained Tomcat environment.

To run this app on your system:
1. You should have Java, Maven, MySQL installed and running.
2. Download the application (Clone or extract).
3. Navigate to the application directory.
4. To build the application - mvn clean install
5. To run the application - mvn spring-boot:run (Make sure that no process is running on port 8080 used by Tomcat)
