package com.library.main;

import com.library.model.Book;
import com.library.model.Role;
import com.library.model.User;
import com.library.service.LibraryService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService service = new LibraryService();

        while (true) {

            System.out.println("\n===== LIBRARY SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    // ================= REGISTER =================
                    case 1:
                        System.out.print("Enter User ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        // default role always user
                        service.addUser(new User(id, name, Role.USER));
                        break;

                    // ================= LOGIN =================
                    case 2:
                        System.out.print("Enter User ID: ");
                        int loginId = Integer.parseInt(sc.nextLine());

                        User loggedUser = service.login(loginId);

                        if (loggedUser == null) {
                            System.out.println(" Invalid login!");
                            break;
                        }

                        System.out.println("Welcome " + loggedUser.getName());

                        Role role = loggedUser.getRole();

                        if (role == Role.ADMIN) {
                            adminMenu(sc, service);
                        } else {
                            userMenu(sc, service, loggedUser);
                        }
                        break;

                    // ================= EXIT =================
                    case 3:
                        System.out.println(" Exiting system...");
                        sc.close();
                        return;

                    default:
                        System.out.println(" Invalid choice");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter numbers only.");
            }
        }
    }

    // ================= ADMIN MENU =================
    public static void adminMenu(Scanner sc, LibraryService service) {

        while (true) {

            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");

            try {
                int ch = Integer.parseInt(sc.nextLine());

                switch (ch) {

                    case 1:
                        System.out.print("Enter Book ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();

                        service.addBook(new Book(id, title, author));
                        break;

                    case 2:
                        service.showBooks();
                        break;

                    case 3:
                        System.out.print("Enter User ID: ");
                        int uid = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Book ID: ");
                        int bid = Integer.parseInt(sc.nextLine());

                        service.issueBook(uid, bid);
                        break;

                    case 4:
                        System.out.println(" Logging out...");
                        return;

                    default:
                        System.out.println(" Invalid choice");
                }

            } catch (NumberFormatException e) {
                System.out.println(" Invalid input! Please enter numbers only.");
            }
        }
    }

    // ================= USER MENU =================
    public static void userMenu(Scanner sc, LibraryService service, User user) {

        while (true) {

            System.out.println("\n===== USER MENU =====");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");

            try {
                int ch = Integer.parseInt(sc.nextLine());

                switch (ch) {

                    case 1:
                        service.showBooks();
                        break;

                    case 2:
                        System.out.print("Enter Book ID: ");
                        int bid = Integer.parseInt(sc.nextLine());

                        service.issueBook(user.getId(), bid);
                        break;

                    case 3:
                        System.out.print("Enter Book ID: ");
                        int rid = Integer.parseInt(sc.nextLine());

                        service.returnBook(rid);
                        break;

                    case 4:
                        System.out.println(" Logging out...");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (NumberFormatException e) {
                System.out.println(" Invalid input! Please enter numbers only.");
            }
        }
    }
}