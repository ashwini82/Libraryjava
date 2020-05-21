package oopLibrary;

public class Periodical extends LibraryItem {
    private String publisher;

    public Periodical(int itemId, String itemName, String itemType, boolean availability, double pageCount,
            String publisher) {
        super(itemId, itemName, itemType, availability, pageCount);
        this.publisher = publisher;
    }

    // getter//
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}