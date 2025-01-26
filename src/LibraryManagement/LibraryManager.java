package LibraryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    static class Book {
        int id;
        String title;
        String author;
        boolean isIssued;

        public Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.isIssued = false;
        }

       
        public String toString() {
            return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Issued: " + (isIssued ? "Yes" : "No");
        }
    }

    static class Member {
        int id;
        String name;

        public Member(int id, String name) {
            this.id = id;
            this.name = name;
        }

        
        public String toString() {
            return "Member ID: " + id + ", Name: " + name;
        }
    }

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
        System.out.println("Book added successfully.");
    }

    public void addMember(int id, String name) {
        members.add(new Member(id, name));
        System.out.println("Member added successfully.");
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.id == bookId && !book.isIssued) {
                book.isIssued = true;
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.id == bookId && book.isIssued) {
                book.isIssued = false;
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid book ID or the book is not issued.");
    }

    public void listBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

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
            System.out.println("6. List Members");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    manager.addBook(bookId, title, author);
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    manager.addMember(memberId, name);
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    bookId = scanner.nextInt();
                    manager.issueBook(bookId);
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    bookId = scanner.nextInt();
                    manager.returnBook(bookId);
                    break;

                case 5:
                    manager.listBooks();
                    break;

                case 6:
                    manager.listMembers();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

	public void addBook(LibraryManagement.Book book) {
		
		
	}

	public boolean issueBook(int bookId, int memberId) {
		
		return false;
	}

	public void addMember(LibraryManagement.Member member) {
		
		
	}
}
