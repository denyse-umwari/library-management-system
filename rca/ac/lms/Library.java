//library class

package rca.ac.lms;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> availableBooks;

    public Library() {
        this.availableBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public void removeBook(Book book) {
        availableBooks.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available books in the library:");
        for (Book book : availableBooks) {
            System.out.println(book);
        }
    }
}
