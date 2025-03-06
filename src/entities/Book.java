package entities;

public class Book {
    private Integer ID;
    private String title;
    private String author;
    private String synopsis;
    private Boolean avaliability = true;

    public Book() {
    }

    public Book(Integer ID, String title, String author, String synopsis) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Boolean isAvaliable() {
        return avaliability;
    }

    public void rentBook() {
        this.avaliability = false;
    }

    public void returnBook() {
        this.avaliability = true;
    }
}
