package oopLibrary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Harry Potter", "book", false, 230, "adcf", "fiction");
        Book book2 = new Book(2, "Troll Hunter", "book", true, 312, "sdce", "fiction");

        List<Book> bk = new ArrayList<>();
        bk.add(book1);
        bk.add(book2);

        for (Book d : bk) {
            System.out.println(d);
        }
    }
}