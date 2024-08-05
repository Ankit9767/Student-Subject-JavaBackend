## Student-Subject JavaBackend 

## Overview : 
- This is a simple Spring Boot application with basic CRUD operations for students and subjects. The application uses an in-memory H2 database.

## NOTE : All the Project is working good and is debuggable , only Security functions were not added to the project because they caused errors in the API endpoints either program is running successfully with all working features.
 ## Prerequisites : 
 
Before setting up the project, ensure you have the following installed:
- Java 22 (or compatible version)
- Maven (3.6.0 or higher)

 ## Setup Instructions

  1. Clone the repository from GitHub (or your version control system) to your local machine.
      
      git clone <repository-url>
      cd Student-Subject-backend

  2. Navigate to the project directory and build the project using Maven.

      mvn clean install
     
  3. Start the Spring Boot application using the following Maven command:
      mvn spring-boot:run

  4. Access the H2 Database Console :

      Open your web browser and navigate to http://localhost:8080/h2-console
     
         Use the following credentials to log in:
                    JDBC URL: jdbc:h2:mem:testdb
                    Username: sa
                    Password: password

     ## API Endpoints

   1. Create a Student : 
          URL: /students
          Method: POST
        Request Body: example :
                         {
                    "name": "John Doe",
                    "address": "123 Main St",
                    "subjects": [
                  {
                      "id": 1
                      },
                      {
                        "id": 2
                      }
                    ]
                  }


  2. Get All Students : 
          URL: /students
          Method: GET


  3. Create a Subject : 

        URL: /subjects
        Method: POST
        Request Body: example :
                   {
                "name": "Mathematics"
              }

  4.Get All Subjects : 

      URL: /subjects
      Method: GET

## This `README.md` file covers all the necessary steps for setting up, running, and interacting with your Spring Boot project. Feel free to adjust the instructions and details based on your specific project setup and needs.

      
                   
