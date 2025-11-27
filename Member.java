import java.time.*;
import java.util.*;

public class Member {
    private String memberID;
    private String name;
    private String contactInfo;
    private LocalDate membershipDate;
    private ArrayList<String> borrowedBooks;
    private static int counter = 1000;

    public Member(String name, String contactInfo) {
        this.memberID = "MEM" + (counter++);
        this.name = name;
        this.contactInfo = contactInfo;
        this.membershipDate = LocalDate.now();
        this.borrowedBooks = new ArrayList<>();
    }

    public void registerMember() {
        System.out.println("=== Member Registration ===");
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contactInfo);
        System.out.println("Registration Date: " + membershipDate);
        System.out.println("Registration successful!");
    }

    public void updateContactInfo(String newContactInfo) {
        System.out.println("=== Updating Contact Info ===");
        System.out.println("Old Contact: " + this.contactInfo);
        this.contactInfo = newContactInfo;
        System.out.println("New Contact: " + this.contactInfo);
        System.out.println("Contact info updated successfully!");
    }

    public void viewBorrowedBooks() {
        System.out.println("\n=== Borrowed Books ===");
        System.out.println("Member: " + name + " (ID: " + memberID + ")");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books currently borrowed.");
        } else {
            System.out.println("Total borrowed: " + borrowedBooks.size());
            for (int i = 0; i < borrowedBooks.size(); i++) {
                System.out.println((i + 1) + ". Book ID: " + borrowedBooks.get(i));
            }
        }
        System.out.println("======================\n");
    }

    public void addBorrowedBook(String bookID) {
        borrowedBooks.add(bookID);
    }

    public void removeBorrowedBook(String bookID) {
        borrowedBooks.remove(bookID);
    }

    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }
}

