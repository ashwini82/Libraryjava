package oopLibrary;

public class LibraryItem {

    private int itemId;
    private double pageCount;
    private String itemName, itemType;
    private boolean availability;

    // constructor for Libraryitem//
    public LibraryItem(int itemId, String itemName, String itemType, boolean availability, double pageCount) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
        this.pageCount = pageCount;
        this.availability = availability;
    }

    // getters//
    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public double getPageCount() {
        return pageCount;
    }

    public boolean getAvailability() {
        return availability;
    }

    // setters//

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setPageCount(double pageCount) {
        this.pageCount = pageCount;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // display method//
    public String toString() {
        return this.getItemName() + " " + this.getItemType() + " " + this.getAvailability();

    }

}