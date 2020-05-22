package oopLibrary;

public class Periodical extends LibraryItem {
    private PublishingCompany publisher;

    public Periodical(int itemId, String itemName, String itemType, boolean availability, double pageCount,
            PublishingCompany publisher) {
        super(itemId, itemName, itemType, availability, pageCount);
        this.publisher = publisher;
    }

    // getter//
    public PublishingCompany getPublisher() {
        return publisher;
    }

    public void setPublisher(PublishingCompany publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return this.getItemName() + " " + this.getItemType() + " " + this.getAvailability() + " " + +this.getPageCount()
                + " " + this.getPublisher();
    }

}