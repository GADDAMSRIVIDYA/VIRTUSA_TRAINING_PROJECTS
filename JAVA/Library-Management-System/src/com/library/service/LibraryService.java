package com.library.service;

import com.library.model.*;
import java.util.*;

public class LibraryService {

    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    // Constructor → default admin added
    public LibraryService() {
        users.add(new User(1, "srividya", Role.ADMIN));
    }

    // Add Book
    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added!");
    }

    // Register User
    public void addUser(User u) {
        for (User user : users) {
            if (user.getId() == u.getId()) {
                System.out.println("User already exists with this ID!");
                return;
            }
        }
        users.add(u);
        System.out.println("User registered as " + u.getRole());
    }

    // LOGIN METHOD
    public User login(int userId) {
        for (User u : users) {
            if (u.getId() == userId) {
                return u;
            }
        }
        return null;
    }

    // Show Books
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println(" No books available!");
            return;
        }
        for (Book b : books) {
            b.display();
        }
    }

    // Issue Book
    public void issueBook(int userId, int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId && !b.isIssued()) {
                b.setIssued(true);
                transactions.add(new Transaction(userId, bookId));
                System.out.println("Book issued!");
                return;
            }
        }
        System.out.println("Book not available!");
    }

    // Return Book
    public void returnBook(int bookId) {
        for (Transaction t : transactions) {
            if (t.getBookId() == bookId && t.getReturnDate() == null) {

                t.returnBook();

                long days = t.getReturnDate().toEpochDay() - t.getIssueDate().toEpochDay();
                long fine = (days > 7) ? (days - 7) * 10 : 0;

                for (Book b : books) {
                    if (b.getId() == bookId) {
                        b.setIssued(false);
                    }
                }

                System.out.println("Book returned!");
                System.out.println("Days: " + days);
                System.out.println("Fine: " + fine);
                return;
            }
        }
        System.out.println("Transaction not found!");
    }

    // Search Book
    public void searchBook(String keyword) {

        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                b.getAuthor().toLowerCase().contains(keyword.toLowerCase()) ||
                String.valueOf(b.getId()).equals(keyword)) {

                b.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println(" No matching book found!");
        }
    }
}