<h1 align="center">Library Management System</h1>

### Project Overview

The Library Management System is a console-based Java application designed to automate basic library operations such as book management, user registration, and transaction tracking (issue/return of books).

It demonstrates Object-Oriented Programming (OOP) concepts in Java including classes, objects, enums, and service-layer architecture.

# Objectives
Manage books, users, and transactions efficiently
Track issued and returned books
Automate library operations to reduce manual effort

Implement role-based access control (Admin/User)

### Features

#### Admin


* Registeration & Login
  
  ![Registeration & Login](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/JAVA/Library-Management-System/Screenshots/Resgistration.jpeg)

* Admin Menu
  
  ![adminMenu](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/JAVA/Library-Management-System/Screenshots/adminMenu.jpeg)

* Add Book
  
  ![addBook](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/JAVA/Library-Management-System/Screenshots/addBook.jpeg)

* Issue Book and Show Book
  
  ![issueBook&ShowBook](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/JAVA/Library-Management-System/Screenshots/issueBook%20and%20ShowBooks.jpeg)

* logout:
  
  ![logout](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/JAVA/Library-Management-System/Screenshots/Logout.jpeg)

### User

* Registeration & Login
  
  ![userRegister&userLogin](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/JAVA/Library-Management-System/Screenshots/userRegister%20and%20userLogin.jpeg)

* Show Book and Return Book
  
  ![showBookAndReturnBook](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/JAVA/Library-Management-System/Screenshots/userMenu.jpeg)

 
# Technologies Used
Java (Core Java)
OOP Concepts
Collections Framework
Java Time API (LocalDate)

Console-based UI
 # Project Structure


```
Library-Management-System/
│── src/com/library/
│   ├── main/
│   │   ├── Main.java
│   │   └── Main.class
│   ├── model/
│   │   ├── Book.java
│   │   ├── Book.class
│   │   ├── User.java
|   |   ├── User.class
│   │   ├── Role.java
|   |   ├── Role.class
│   │   ├── Transaction.java
|   |   └── Transaction.class
│   └── service/
|   |   ├── LibraryService.java
|   │   └── LibraryService.class
|   └──Screenshots/ # contains ouput images
└──README.md
```


### Key OOP Concepts Used
* Encapsulation (private fields with getters/setters)
* Abstraction (Service layer handling logic)
* Enum (Role-based access control)
* Classes & Objects
* List Collections

 # Author
Gaddam Sri Vidya

Developed as a learning project to understand Java OOP and system design basics.

