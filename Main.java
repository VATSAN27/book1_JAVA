
import java.util.Scanner;

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[5];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book added successfully!");
                return;
            }
        }
        System.out.println("Library is full. Cannot add more books.");
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookID() == bookID) {
                books[i] = null;
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void searchBook(int bookID) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookID() == bookID) {
                System.out.println("Book found:");
                System.out.println("Book ID: " + books[i].getBookID());
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println("Availability: " + (books[i].isAvailable() ? "Available" : "Not Available"));
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("Book ID: " + books[i].getBookID());
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println("Availability: " + (books[i].isAvailable() ? "Available" : "Not Available"));
                System.out.println("-------------------------");
            }
        }
    }
}

