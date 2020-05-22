package oopLibrary;

import java.util.ArrayList;

public class OverdueList<E extends LibraryItem> {
    ArrayList<E> overdueItems;

    public OverdueList() {
        overdueItems = new ArrayList<>();
    }

    public void addOverdueItems(E item) {
        overdueItems.add(item);
    }

    public void removeOverdueItems(E item) {
        overdueItems.remove(item);
    }

    public void printOverDueList() {
        for (E d : overdueItems) {
            System.out.println(d);
        }

    }

}