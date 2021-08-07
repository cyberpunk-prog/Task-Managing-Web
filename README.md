# Task-Managing-Web
This project would cover the full stack development . Using spring boot,postgres as backend and react as frontend.

## Steps:

### 1. Create the project spring-boot from start.spring.io: 

https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.5.3&packaging=jar&jvmVersion=1.8&groupId=com.tiucompany&artifactId=taskmanager&name=taskmanager&description=Demo%20project%20for%20Spring%20Boot&packageName=com.tiucompany.taskmanager&dependencies=web,data-jdbc,postgresql,flyway

**Note** : The spring-boot-starter-data-jdbc dependency is commented out as this hinders initial deployment. Would be configured later.

### 2. Create the TaskDetail class with the required fields.

Added Constructor and the getters.

### 3. Create the React App inside the src

Below are the commands used:

**Using Ubuntu:**

      curl -fsSL https://deb.nodesource.com/setup_16.x | sudo -E bash -
      sudo apt-get install -y nodejs

Create React app in the src folder:

      npx create-react-app js

Initial run:

      cd js
      npm start
      
