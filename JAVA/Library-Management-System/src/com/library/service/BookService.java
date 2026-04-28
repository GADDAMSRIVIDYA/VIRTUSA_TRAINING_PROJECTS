package com.library.service;

import com.library.model.Book;
import java.util.ArrayList;
import java.time.LocalDate;

public class BookService {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        for (Book b: books){
            if (b.getBookId() == book.getBookId()){
                System.out.println("Book with this ID already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void viewBooks(){
        if (books.isEmpty()){
            System.out.println("No books available.");
            return;
        }

        for (Book b: books){
            System.out.println(
                "ID: " + b.getBookId() +
                ", Title: " + b.getTitle() +
                ", Author: " + b.getAuthor() +
                ", Status: " + (b.isIssued() ? "Issued" : "Available") +
                ", Issued To: " + (b.getIssuedTo() != null ? b.getIssuedTo() : "None")
            );
        }
    }

    public void issueBook(int bookId, String userEmail){
        for (Book b : books){
            if (b.getBookId() == bookId){

                if (b.isIssued()){
                    System.out.println("Book is already issued.");
                    return;
                }

                b.setIssued(true);
                b.setIssuedTo(userEmail);

                LocalDate today = LocalDate.now();
                LocalDate returnDate = today.plusDays(7);

                b.setIssueDate(today);
                b.setReturnDate(returnDate);

                System.out.println("Book issued successfully. Return by: " + returnDate);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId){
        for (Book b: books){
            if(b.getBookId() == bookId){

                if(!b.isIssued()){
                    System.out.println("Book is not issued.");
                    return;
                }

                b.setIssued(false);

                LocalDate today = LocalDate.now();
                LocalDate dueDate = b.getReturnDate();

                long fine = (today.toEpochDay() - dueDate.toEpochDay()) * 5;

                if (fine < 0){
                    fine = 0;
                }

                System.out.println("Book returned successfully.");

                if (fine > 0){
                    System.out.println("Please pay fine: ₹" + fine);
                }

                b.setIssuedTo(null);

                b.setIssueDate(null);
                b.setReturnDate(null);

                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchBooks(String keyword){
        boolean found = false;

        for(Book b: books){
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                b.getAuthor().toLowerCase().contains(keyword.toLowerCase())){

                System.out.println(
                    "ID: " + b.getBookId() +
                    ", Title: " + b.getTitle() +
                    ", Author: " + b.getAuthor() +
                    ", Status: " + (b.isIssued() ? "Issued" : "Available") +
                    ", Issued To: " + (b.getIssuedTo() != null ? b.getIssuedTo() : "None")
                );

                found = true;
            }
        }

        if (!found){
            System.out.println("No books found with the keyword: " + keyword);
        }
    }

    public void updateBook(int bookId, String newTitle, String newAuthor){
        for (Book b: books){
            if (b.getBookId() == bookId){
                b.setTitle(newTitle);
                b.setAuthor(newAuthor);
                System.out.println("Book updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void removeBook(int bookId){
        Book toRemove = null;

        for (Book b : books){
            if (b.getBookId() == bookId){
                toRemove = b;
                break;
            }
        }

        if (toRemove != null){
            books.remove(toRemove);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}