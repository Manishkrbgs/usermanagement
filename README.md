# PROJECT-"UserManagementSystem"
## table of contents
* Frameworks and Language Used
* Dataflow
* Data Structure
* Project Summary
  
## Frameworks and Language Used
* Java: The primary programming language used for developing the application.
* Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
* Spring Boot: A framework built on top of the Spring framework, providing rapid application development features for creating stand-alone, production-grade Spring-based applications.
* Lombok: A Java library that helps reduce boilerplate code by providing annotations to automatically generate getters, setters, constructors, and other utility methods.
## Dataflow
* The user management application follows the following data flow:

* Client Interaction: The client, such as Postman, sends requests to the Localhost server for user management operations, including creating, reading, updating, and deleting users (CRUD operations).

* Controller Layer: In the Spring Boot application, the incoming requests are handled by the Controller layer. The Controller receives the requests and delegates them to the appropriate methods in the service layer.

* Service Layer: The Service layer contains the business logic of the application and handles user management operations. When a request is received from the Controller, the Service layer performs the necessary actions. For example, when creating a new user, the Service layer validates the input data, generates a unique identifier, and interacts with the data access layer.

* Data Access Layer: The Data Access layer is responsible for interacting with the underlying data storage, such as the UserRepo. In the user management application, it handles CRUD operations on the user data. When creating a new user, the Data Access layer inserts the user's information into the database.

*Database: The database stores the user data. It receives the insert, update, or delete statements from the Data Access layer and performs the corresponding operations on the user table. This is done uing hashmap.

* Response: After the data operation is completed, the response flows back through the layers in the reverse order. The Service layer receives the response from the Data Access layer, performs any necessary post-processing or formatting, and sends it back to the Controller.

* Controller Response: The Controller layer receives the response from the Service layer and returns an appropriate HTTP response to the client, indicating the success or failure of the requested operation.

## Data Structure
* HashMap : This is used for as a DataBase and stores the User InforMation in form of User class.

* ArrayList : ArrayList or list are used in methods for ease of code . They are used for returning or getting data .
## project summary
* This is a project api for user management system for checking out api's which helps storing user data.

## Installation and Usage
* Run code using an ide and check progress on postman.
