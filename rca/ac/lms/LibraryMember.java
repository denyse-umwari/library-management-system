package rca.ac.lms;

import java.util.ArrayList;
import java.util.List;

//LibraryMember class

public class LibraryMember {
    private int memberId;
    private String name;
    private List<Book> borrowedBooks;

    public LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and setters
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    // Methods to borrow books
    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 5) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book);
        } else {
            System.out.println(name + " has already borrowed the maximum number of books.");
        }
    }

    // Methods to return books
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " returned: " + book);
    }

    // Method to display borrowed books
    public void displayBorrowedBooks() {
        System.out.println(name + "'s borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
