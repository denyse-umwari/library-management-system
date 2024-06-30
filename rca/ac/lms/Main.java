package rca.ac.lms;

// Example usage
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("123456", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("789012", "To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("925555", "It Ends With Us", "Collin Hoover", 2016);
        Book book4 = new Book("978014", "Pride and Prejudice", "Jane Austen", 1813);
        Book book5 = new Book("9256433", "Corrupt", "Penelope Douglas", 2015);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        LibraryMember member1 = new LibraryMember(1, "Alice");
        member1.borrowBook(book1);
        member1.borrowBook(book2);
        member1.borrowBook(book4);
        System.out.println();
        member1.displayBorrowedBooks();

        System.out.println();

        LibraryMember member2 = new LibraryMember(2, "Bob");
        member2.borrowBook(book1);
        member2.borrowBook(book3);
        member2.borrowBook(book5);

        System.out.println();
        member2.displayBorrowedBooks();

        System.out.println();

        library.displayAvailableBooks();
    }
}