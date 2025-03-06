package app;

import entities.DatabaseManager;

public class TestDatabaseManager {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();

        if (dbManager.connect() != null) {
            System.out.println("Connection is ok!");
        }
        else {
            System.out.println("Connection failed.");
        }
        dbManager.disconnect();
    }

}
