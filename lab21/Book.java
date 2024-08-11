package javafullstack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Book {
    private int bookId;
    private String bookName;
    private double bookPrice;
    private String authorName;
    private static String libraryName = "MyLibrary";
    private boolean availability;

    // Constructor
    public Book(int bookId, String bookName, double bookPrice, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = true; // Default availability
    }

    // Static method to add a book to the list
    public static void createBook(List<Book> books, int bookId, String bookName, double bookPrice, String authorName) {
        Book newBook = new Book(bookId, bookName, bookPrice, authorName);
        books.add(newBook);
        System.out.println("Book added successfully!");
    }

    // Static method to delete a book by ID
    public static void deleteBook(List<Book> books, int bookId) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.bookId == bookId) {
                iterator.remove();
                System.out.println("Book with ID " + bookId + " deleted successfully!");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Instance method to display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + authorName);
        System.out.println("Price: Rs." + bookPrice);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println("Library: " + libraryName);
    }



    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding books dynamically
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter book details for book #" + (i + 1));
            System.out.print("Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Book Name: ");
            String bookName = scanner.nextLine();
            System.out.print("Author Name: ");
            String authorName = scanner.nextLine();
            System.out.print("Book Price: Rs.");
            double bookPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            Book.createBook(books, bookId, bookName, bookPrice, authorName);
        }

        // Displaying all books
        System.out.println("\nDisplaying all books:");
        for (Book book : books) {
            book.displayBook();
            System.out.println();
        }

        // Deleting a book
        System.out.print("Enter the Book ID to delete: ");
        int deleteId = scanner.nextInt();
        Book.deleteBook(books, deleteId);

        // Displaying all books after deletion
        System.out.println("\nDisplaying all books after deletion:");
        for (Book book : books) {
            book.displayBook();
            System.out.println();
        }

        scanner.close(); // Close scanner to avoid resource leak
    }
}

