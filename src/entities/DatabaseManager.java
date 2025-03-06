package entities;

import java.sql.*;

public class DatabaseManager {

    private static final String URL = "jdbc:mysql://localhost:3306/library_system";
    private static final String USER = "root";
    private static final String PASSWORD = "#Malakoi2";
    private static Connection connection = null;

    public static Connection connect() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connected sucessfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error: Unable to connect to the data base. " + e.getMessage());
        }
        return connection;
    }

    public static void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected sucessfully!");
            }
        } catch(SQLException e) {
            System.out.println("Error: Unable to disconnect. " + e.getMessage());
        }
    }

    public void addBook(Book book) {
        String query = "INSERT INTO books (id, title, author, synopsis)" +
                "VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, book.getID());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setString(4, book.getSynopsis());

            pstmt.executeUpdate();
            System.out.println("Book added sucessfully!");
        } catch (SQLException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
    }
    public void removeBook(int ID) {
        String query = "DELETE FROM books WHERE id=?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, ID);

            pstmt.executeUpdate();
            System.out.println("Book removed sucessfully!");
        } catch (SQLException e) {
            System.out.println("Error removing the book: " + e.getMessage());
        }
    }

    public Book listBook(int ID) {
        String query = "SELECT * FROM books WHERE id=?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, ID);
             ResultSet resultSet = pstmt.executeQuery();
             if (resultSet.next()) {
                 Book book = new Book(resultSet.getInt("id"), resultSet.getString("title"),
                         resultSet.getString("author"), resultSet.getString("synopsis"));
                 return book;
             }
             else {
                 System.out.println("Couldn't find a book with that ID! (" + ID + ")");
                 return null;
             }
        } catch (SQLException e ) {
            System.out.println("Couldn't not read the book " + e.getMessage());
            return null;
        }

    }
}
