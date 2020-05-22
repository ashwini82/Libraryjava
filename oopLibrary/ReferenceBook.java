package oopLibrary;

public class ReferenceBook extends Book {

    public ReferenceBook(int itemId, String itemName, String itemType, boolean availability, double pageCount,
            Author author, String genre) {
        super(itemId, itemName, itemType, availability, pageCount, author, genre);

    }

    public void isCheckOutPossible() {
        boolean isCheckOutPossible = false;

        if (isCheckOutPossible) {
            System.out.println("Checkout is not possible.");
        } else {
            System.out.println("This item is not for checkout.");
        }

    }
}
