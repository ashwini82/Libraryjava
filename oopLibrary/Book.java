package oopLibrary;

public class Book extends LibraryItem implements Reservable, Loanable {

    private Author author;
    private String genre;

    // constructor//
    public Book(int itemId, String itemName, String itemType, boolean availability, double pageCount, Author author,
            String genre) {

        super(itemId, itemName, itemType, availability, pageCount);
        this.author = author;
        this.genre = genre;
    }

    // getter//

    public String getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

    // setter//
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return this.getItemName() + " " + this.getItemType() + " " + this.getAvailability() + " " + this.getAuthor()
                + " " + this.getGenre();
    }

    // Implement//
    @Override
    public boolean isReservable() {
        return true;
    }

    @Override
    public boolean isLoanable() {
        return true;
    }
}