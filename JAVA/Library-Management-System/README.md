📚 Library Management System (Java)
Project Overview

The Library Management System is a console-based Java application designed to automate basic library operations such as book management, user registration, and transaction tracking (issue/return of books).

It demonstrates Object-Oriented Programming (OOP) concepts in Java including classes, objects, enums, and service-layer architecture.

Objectives
Manage books, users, and transactions efficiently
Track issued and returned books
Automate library operations to reduce manual effort

Implement role-based access control (Admin/User)
✨ Features

Book Management
Add new books
View all available books
Track issued status

User Management
User registration system
Role-based access (ADMIN / USER)

Transaction System
Issue books to users
Return books
Track issue and return dates

Fine Calculation
Calculates fine for late returns (beyond 7 days)
Search Functionality
Search books by:
Title
Author
Book ID

Technologies Used
Java (Core Java)
OOP Concepts
Collections Framework
Java Time API (LocalDate)

Console-based UI
Project Structure


```
com.library
│
├── main
│   └── Main.java
│
├── model
│   ├── Book.java
│   ├── User.java
│   ├── Role.java
│   └── Transaction.java
│
├── service
│   └── LibraryService.java

```

How to Run
Clone the repository
git clone https://github.com/your-username/library-management-system.git
Open in any Java IDE (IntelliJ / Eclipse / VS Code)

Compile and run:
javac Main.java
java Main

Key OOP Concepts Used
Encapsulation (private fields with getters/setters)
Abstraction (Service layer handling logic)
Enum (Role-based access control)
Classes & Objects
List Collections

Sample Output
===== LIBRARY SYSTEM =====
1. Register
2. Login
3. Exit

Welcome Admin

===== ADMIN MENU =====
1. Add Book
2. Show Books
3. Issue Book
4. Logout

Future Improvements
1. Database Integration (JDBC + MySQL)
Store users, books, and transactions permanently
Replace in-memory lists with database tables

2. Advanced Role-Based System
Separate permissions for Admin and Users
Admin approval for user registration
Multiple admin roles (Super Admin / Librarian)

3. Due Date System
Add due date for each issued book
Auto fine calculation based on delay

4. GUI Version
Build UI using Java Swing or JavaFX

5. Reports & Analytics
Most issued books
User activity logs
Fine reports

Author
Gaddam Sri Vidya

Developed as a learning project to understand Java OOP and system design basics.

⭐ If you like this project

Give it a ⭐ on GitHub and feel free to improve it!
