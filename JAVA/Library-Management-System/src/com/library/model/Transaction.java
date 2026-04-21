package com.library.model;

import java.time.LocalDate;

public class Transaction {
    private int userId;
    private int bookId;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Transaction(int userId, int bookId) {
        this.userId = userId;
        this.bookId = bookId;
        this.issueDate = LocalDate.now();
        this.returnDate = null;
    }

    public int getBookId() { return bookId; }
    public int getUserId() { return userId; }
    public LocalDate getIssueDate() { return issueDate; }
    public LocalDate getReturnDate() { return returnDate; }

    public void returnBook() {
        this.returnDate = LocalDate.now();
    }
}