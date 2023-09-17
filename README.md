# UrlHitCounter# URL Hit Counter Application

This is a simple Spring Boot application that tracks the hit count for specific URLs based on usernames. It provides a RESTful API to retrieve the hit count for a given usernamer


## Framework and Language Used
Framework: Spring Boot

Language: Java
## Data Flow
The data flow in this application is as follows:

1. The client sends a GET request to the API endpoint /api/v1/visitor-count-app/username/{username}/count, providing the desired username.

2. The request is handled by the UrlHitController class, which is responsible for mapping the endpoint and calling the appropriate service.
3. The UrlHitController class then invokes the getHitCountByUsername method of the UrlHitService class, passing the username.
4. The UrlHitService class retrieves the hit count for the username from the hitCountMap data structure.
5. If the username does not exist in the hitCountMap, it is added with an initial hit count of 0.
6. The hit count is incremented by 1 and stored back in the hitCountMap.
7. The updated hit count is returned to the controller.
8. The controller constructs a response object containing the username and hit count and returns it to the client.
## Project Structure
The project has the following structure:

1. com.example.urlHitController.controller: Contains the UrlHitController class responsible for handling API requests.
2. com.example.urlHitController.service: Contains the UrlHitService class responsible for managing the hit count logic.
3. com.example.urlHitController: Contains the main application class 

4. UrlHitControllerApplicationTests used to run the Spring Boot application.

## Database Design
This application does not utilize a traditional database. It stores the hit count data in memory using a HashMap. The hitCountMap in the UrlHitService class serves as a simple data structure to store the hit count for each username.
## Summary
The URL Hit Counter application is a basic Spring Boot project that demonstrates how to implement a simple hit counter feature. It tracks the hit count for specific usernames using an in-memory data structure. This application can be extended to include additional functionality and integrated with a persistent database if required.

