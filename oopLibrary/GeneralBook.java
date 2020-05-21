package oopLibrary;

public class GeneralBook extends Book {

    public GeneralBook(int itemId, String itemName, String itemType, boolean availability, double pageCount,
            String author, String genre) {
        super(itemId, itemName, itemType, availability, pageCount, author, genre);

    }

    public void isFiction() {
        boolean isFiction = true;

        if (isFiction) {
            System.out.println("Fiction");
        } else {
            System.out.println("NonFiction");
        }
    }

}