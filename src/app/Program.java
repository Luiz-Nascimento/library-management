package app;


import entities.Book;
import entities.DatabaseManager;
import entities.Menu;

import java.util.Scanner;

import static entities.Menu.loginMenu;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Luiz's Library Management System!");
        System.out.println("Are you an user or an admin?");
        System.out.println(Menu.loginMenu2());
        int userResponse = sc.nextInt();
        if (userResponse == 2) {
            System.out.println(Menu.showAdminMenu());
            userResponse = sc.nextInt();
            if (userResponse == 1) {
                System.out.println("Book ID:");
                int bookID = sc.nextInt();
                System.out.println("Book Title:");
                sc.nextLine();
                String bookTitle = sc.nextLine();
                System.out.println("Book Author:");
                String bookAuthor = sc.nextLine();
                System.out.println("Book Synopsis:");
                String bookSynopsis = sc.nextLine();
                Book book = new Book(bookID, bookTitle, bookAuthor, bookSynopsis);
                DatabaseManager dbManager = new DatabaseManager();
                dbManager.connect();
                dbManager.addBook(book);
                dbManager.disconnect();
            }
        }
        else {
            System.out.println("User menu still not finished.");
        }
        System.out.println("End of program.");
    }
}
