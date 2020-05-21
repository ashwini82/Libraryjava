package oopLibrary;

import java.util.Date;

public class CardHolder extends Person {

    private Date checkIn;
    private Date checkOut;
    private boolean holdItems;

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
}