package com.library.model;
import java.time.LocalDate;

public class Book{
    private int bookId;
    private String title;
    private String author;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private boolean isIssued;
    private String issuedTo;


    public Book( int bookId, String title, LocalDate isssDate,LocalDate returnDate ,String author, String issuedTo) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issueDate = isssDate;
        this.returnDate = returnDate;
        this.isIssued = false;
        this.issuedTo = issuedTo;
    }

        public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issueDate = null;
        this.returnDate = null;
        this.isIssued = false;
        this.issuedTo = null;
    }

    public int getBookId(){
        return bookId;
    }

    public String getTitle (){
        return title;
    }

    public void setTitle (String title){
        this.title = title;
        
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
    
    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public String getIssuedTo(){
    return issuedTo;
    }

    public void setIssuedTo(String issuedTo){
        this.issuedTo = issuedTo;
    }
}