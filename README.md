# student-management-system (backend)
This is a Student Management System backend built using Spring Boot.
It provides a set of RESTful APIs to perform CRUD (Create, Read, Update, Delete) operations on student data.
The APIs are tested using Postman.

# Tech Stack
Language: Java

Framework: Spring Boot, Spring Boot JDBC

Build Tool: Maven

Database: MySQL 

IDE: Eclipse STS (Spring Tool Suite)

# Features
Add new student

Get all students

Get student by ID

Update student details

Delete student

Input validation

Global exception handling

Layered architecture (Controller → Service → DAO → Database)

#  API Endpoints
| Method | Endpoint           | Description          |
|--------|---------------------|-----------------------|
| POST   | /students/add      | Add new student        |
| GET    | /students/all      | Get all students       |
| GET    | /students/{id}     | Get student by ID      |
| PUT    | /students/update/{id} | Update existing student |
| DELETE | /students/delete/{id} | Delete student by ID |

# Project Structure

src/main/java/com/example/studentmanagement
│
├── controller
│   └── StudentController.java

│
├── service
│   ├── StudentService.java
│   └── StudentServiceImpl.java

│
├── repository
│   └── StudentRepository.java

│
├── model
│   └── Student.java

│
└── exception
    ├── GlobalExceptionHandler.java
    └── StudentNotFoundException.java

# How to Run

Follow these steps to run the Student Management System project on your local machine:

Download this repository

Click the green Code button → Download ZIP

Or clone it using:

git clone https://github.com/<your-username>/<repo-name>.git


Open STS/Eclipse

Go to: File → Import → Existing Maven Project

Select the downloaded project folder and finish the process

Configure Database

Install and start MySQL server

Create a database (e.g. student_db)

Open src/main/resources/application.properties

Update these properties with your local DB credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db

spring.datasource.username=your_username

spring.datasource.password=your_password

Run the Project

Right-click the project folder

Select Run As → Maven Build

In the Goals field, type:

clean spring-boot:run

Click Run

The application will start on:

http://localhost:8080(by- default) you can also change this
