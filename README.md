# disasterassistant-server
A Java backend web service created for DisasterAssistant, an Android application.

You can find the frontend for this project here: [DisasterAssistant Android App (Client)](https://github.com/mansoorhu10/disasterassistant-client).

## How I worked on this project
My goal was to create a simple mobile application with user authentication.
* I worked with scheduled tasks on a Trello board to keep myself on track.
* I built the backend for the app using VS Code, Postman, MySQL Workbench, and programmed it using Java and JUnit for unit testing.

## What I have learned
I learned lots of valuable skills in server-side mobile application development in Java.
* I used Java, MySQL, and Spring Boot to create the backend for the application.
* I used the Spring Data JPA, MySQL JDBC driver, Spring Web dependencies to build REST APIs that perform CRUD operations for floods and users in the database.
* I used MVC architecture to organize the project.
* I learned how to implement user authentication with Spring Security and JSON Web Tokens.
* I tested backend functionality with [JUnit test cases](src/test/java/com/mansoorsyed/disasterassistant/DisasterassistantApplicationTests.java).

## Future Improvements
Once I have enough time to continue working on this project, these are the primary changes and improvements I will make to the app:
* Change the data model for floods being stored in the database so that different types of disasters can be tracked.
* Utilize the Google Maps API to show the location of each disaster on a map.

## Dependencies
* lombok
* mysql-connector
* jjwt-api
* jjwt-jackson
* jjwt-impl
* spring-security-web
* spring-security-config
* [spring-dotenv](https://github.com/paulschwarz/spring-dotenv)
* [dotenv-kotlin](https://github.com/cdimascio/dotenv-kotlin)