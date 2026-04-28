package com.library.main;

import com.library.model.*;
import com.library.service.*;
import java.util.Scanner;
import com.library.util.InputUtil;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        BookService bookService = new BookService();

        boolean running = true; 

        while(running){
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = InputUtil.getInt(scanner);

            switch(choice){

                case 1:
                    System.out.print("Enter name: ");
                    String name = InputUtil.getString(scanner);

                    System.out.print("Enter email: ");
                    String email = InputUtil.getString(scanner);

                    System.out.print("Enter password: ");
                    String password = InputUtil.getString(scanner);

                    System.out.print("Enter role (ADMIN/USER): ");
                    String roleInput = InputUtil.getString(scanner);

                    Role role;
                    try {
                        role = Role.valueOf(roleInput.toUpperCase());
                    } catch (Exception e) {
                        System.out.println("Invalid role! Defaulting to USER.");
                        role = Role.USER;
                    }

                    userService.registerUser(new User(name, email, password, role));
                    break;

                case 2:
                    System.out.print("Enter email: ");
                    String loginEmail = InputUtil.getString(scanner);

                    System.out.print("Enter password: ");
                    String loginPassword = InputUtil.getString(scanner);

                    User loggedInUser = userService.loginUser(loginEmail, loginPassword);

                    if (loggedInUser != null){
                        System.out.println("Welcome, " + loggedInUser.getName() + "!");

                        if (loggedInUser.getRole() == Role.ADMIN){
                            adminMenu(scanner, bookService);
                        } else {
                            userMenu(scanner, bookService, loggedInUser);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    running = false; 
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();
    }

    // ================= ADMIN MENU =================
    public static void adminMenu(Scanner scanner, BookService bookService){

        boolean isAdminMenu = true; 

        while(isAdminMenu){
            System.out.println("\n--- ADMIN MENU ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Logout");

            System.out.print("Enter choice: ");
            int choice = InputUtil.getInt(scanner);

            switch(choice){

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = InputUtil.getInt(scanner);

                    System.out.print("Enter Title: ");
                    String title = InputUtil.getString(scanner);

                    System.out.print("Enter Author: ");
                    String author = InputUtil.getString(scanner);

                    bookService.addBook(new Book(id, title, author));
                    break;

                case 2:
                    bookService.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int upId = InputUtil.getInt(scanner);

                    System.out.print("Enter new Title: ");
                    String newTitle = InputUtil.getString(scanner);

                    System.out.print("Enter new Author: ");
                    String newAuthor = InputUtil.getString(scanner);

                    bookService.updateBook(upId, newTitle, newAuthor);
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int delId = InputUtil.getInt(scanner);

                    bookService.removeBook(delId);
                    break;

                case 5:
                    System.out.println("Logging out...");
                    isAdminMenu = false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // ================= USER MENU =================
    public static void userMenu(Scanner scanner, BookService bookService, User user){

        boolean isUserMenu = true; 

        while(isUserMenu){
            System.out.println("\n--- USER MENU ---");
            System.out.println("1. View Books");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Logout");

            System.out.print("Enter choice: ");
            int choice = InputUtil.getInt(scanner);

            switch(choice){

                case 1:
                    bookService.viewBooks();
                    break;

                case 2:
                    System.out.print("Enter keyword: ");
                    String keyword = InputUtil.getString(scanner);

                    bookService.searchBooks(keyword);
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int issueId = InputUtil.getInt(scanner);

                    bookService.issueBook(issueId, user.getEmail());
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int returnId = InputUtil.getInt(scanner);

                    bookService.returnBook(returnId);
                    break;

                case 5:
                    System.out.println("Logging out...");
                    isUserMenu = false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}