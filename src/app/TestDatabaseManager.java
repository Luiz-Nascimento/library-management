package app;

import entities.DatabaseManager;

import java.util.Scanner;

public class TestDatabaseManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DatabaseManager dbManager = new DatabaseManager();
        System.out.println("ID of the book you want to list: ");
        int id = sc.nextInt();
        dbManager.connect();
        System.out.println(dbManager.listBook(id));
        dbManager.disconnect();
    }

}
