# Inventory Management System

The **Inventory Management System** is a simple Spring Boot application that allows you to manage items in an inventory. 
It provides APIs to add items, update their quantities, retrieve item details, update prices, and delete items. 
The application uses MySQL as the database.

---

## Features

- Add a new item to the inventory.
- Retrieve all items or specific item details by ID.
- Increase or decrease item quantity.
- Update the price of an item.
- Delete an item from the inventory.

---

## Technologies Used

- **Java**: Backend logic using Spring Boot.
- **Spring Boot**: Framework for developing RESTful APIs.
- **MySQL**: Relational database for data persistence.
- **JPA (Java Persistence API)**: ORM for database interaction.
- **Lombok**: Reduces boilerplate code in Java classes.

---
# Pre-requisites
1. Java
2. Maven
3. MySQL Server

# Setup Instructions

## Clone the repository

    git clone https://github.com/Deep-20/Inventory-Management-System.git

Navigate to the project directory:

    cd inventory-management-system

## Installing Dependencies
    mvn clean install

## Database Setup

1. Start your MySQL server.
   1. Create a database named `inventory`
   

2. Update the application.properties file
   1. Check the datasource url for your MySQL server and change if needed
      spring.datasource.url=jdbc:mysql://localhost:3306/inventory 
       
   2. Update the username and password with your credentials
       1. spring.datasource.username=[your-username]
       2. spring.datasource.password=[your-password]

## Run the application:

    mvn spring-boot:run

### OR 

Open the project in IntelliJ IDEA and run the project
    
The application will be accessible at http://localhost:8080.

---

### For detailed API documentation, refer to the file API-IMS.docx.
 
