package oopLibrary;

import java.util.Date;

public class CardHolder extends Person {

    private Date checkIn;
    private Date checkOut;
    private boolean holdItems;

    OverdueList<Book> list1 = new OverdueList<>();
    OverdueList<Periodical> list2 = new OverdueList<>();

    // constructor//
    public CardHolder(String firstName, String lastName, int personId, Date joinDate, Date checkIn, Date checkOut,
            boolean holdItems) {

        super(firstName, lastName, personId, joinDate);
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.holdItems = holdItems;
    }

    // getter//
    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public boolean getHoldItems() {
        return holdItems;
    }

    // setter//
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public void setHoldItems(boolean holdItems) {
        this.holdItems = holdItems;
    }

    public void addOverDueBook(Book item) {
        list1.addOverdueItems(item);
    }

    public void removeOverDueBook(Book item) {
        list1.removeOverdueItems(item);
    }

    public void addOverDueBook(Periodical item) {
        list2.addOverdueItems(item);
    }

    public void removeOverDueBook(Periodical item) {
        list2.removeOverdueItems(item);
    }

    public void printPeriodicals() {
        list2.printOverDueList();
    }

    public void printBooks() {
        list1.printOverDueList();
    }

}