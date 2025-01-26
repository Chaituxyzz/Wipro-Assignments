package LibraryManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            
            System.out.println("4. Return Book");
            System.out.println("5. List Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    manager.addBook(new Book(bookId, title, author));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    manager.addMember(new Member(memberId, name));
                    System.out.println("Member added successfully!");
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    bookId = scanner.nextInt();
                    System.out.print("Enter Member ID: ");
                    memberId = scanner.nextInt();
                    if (manager.issueBook(bookId, memberId)) {
                        System.out.println("Book issued successfully!");
                    } else {
                        System.out.println("Failed to issue book. Either it is already issued or invalid IDs.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    bookId = scanner.nextInt();
                    if (manager.returnBook(bookId)) {
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Failed to return book. Check the ID or if the book is issued.");
                    }
                    break;

                case 5:
                    System.out.println("Listing All Books:");
                    manager.listBooks();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
