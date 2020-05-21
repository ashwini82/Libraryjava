package oopLibrary;

public class Book extends LibraryItem {

    private String author;
    private String genre;

    // constructor//
    public Book(int itemId, String itemName, String itemType, boolean availability, double pageCount, String author,
            String genre) {

        super(itemId, itemName, itemType, availability, pageCount);
        this.author = author;
        this.genre = genre;
    }

    // getter//
    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    // setter//
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return this.getItemName() + " " + this.getItemType() + " " + this.getAvailability() + " " + this.getGenre();
    }
}