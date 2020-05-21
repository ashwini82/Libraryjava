package oopLibrary;

public class Magazine extends Periodical {

    private String publishDuration;

    public Magazine(int itemId, String itemName, String itemType, boolean availability, double pageCount,
            String publisher, String publishDuration) {

        super(itemId, itemName, itemType, availability, pageCount, publisher);

        this.publishDuration = publishDuration;
    }

    // getter//
    public String getPublishDuration() {
        return publishDuration;
    }

    // setter//
    public void setPublishDuration(String publishDuration) {
        this.publishDuration = publishDuration;
    }
}