# Task Tracker API with PostgreSQL Backend
This is a SpringBoot project that contains the following end points
1 POST /tasks: Create a new task.  
2 GET /tasks/{id}: Retrieve a task by its ID.  
3 GET /tasks: Retrieve a list of all tasks.  
4 PUT /tasks/{id}: Update an existing task by its ID.  
5 DELETE /tasks/{id}: Delete a task by its ID.  

## PostgreSQL Configuration
This project contains applicatin.yml file in src/main/resources where you need to provide correct db address  
* To run this application without modification you need to have following things
    1 Postgres database name "assesment"
    2 username "postgres"
    3 password "manish"
* databse should run locally on port 5432
* OR change this file as per your configuration


## How To Run this Project  
1 Clone this project   
2 Open eclipses or STS   
3 Go To "File" Menu and select "Open projects From File System ..."  
4 And provide parent directory of poem.xml in "Import Source" and click on finish  
5 Configure DB as instructed in previous step
6 Run the project
