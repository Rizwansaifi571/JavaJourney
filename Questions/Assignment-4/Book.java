import java.util.Scanner;

class LibraryManagementSystem {
    // Data members
    private String bookID;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    // Method to set book details
    public void setBookDetails(String bookID, String title, String author, String genre, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }


    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Method to check availability and borrow the book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have successfully borrowed the book: " + title);
            isAvailable = false;  // Mark the book as not available
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently not available.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (!isAvailable) {
            System.out.println("You have successfully returned the book: " + title);
            isAvailable = true;  // Mark the book as available again
        } else {
            System.out.println("The book '" + title + "' is already available in the library.");
        }
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new book object
        LibraryManagementSystem book1 = new LibraryManagementSystem();

        // Input book details
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Is the book available? (true/false): ");
        boolean isAvailable = scanner.nextBoolean();

        // Set the book details
        book1.setBookDetails(bookID, title, author, genre, isAvailable);

        int choice;
        do {
            // Display menu
            System.out.println("\nLibrary Book Management System");
            System.out.println("1. Display Book Details");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    book1.displayBookDetails();
                    break;
                case 2:
                    book1.borrowBook();
                    break;
                case 3:
                    book1.returnBook();
                    break;
                case 4:
                    System.out.println("Exiting the Library Book Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
