package oopLibrary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author myAuthor = new Author("Joe", " William ");
        Book book1 = new Book(1, "Harry Potter", "book", false, 230, myAuthor, "fiction");
        // Book book2 = new Book(2, "Troll Hunter", "book", true, 312, "sdce",
        // "fiction");

        // List<Book> bk = new ArrayList<>();
        // bk.add(book1);
        // bk.add(book2);
        Author author = new Author("Aasha", "D.");
        GeneralBook book2 = new GeneralBook(5, "JavaIntro", "GeneralBook", false, 340, author, "Science");
        Author author2 = new Author("Andrew", "M.");
        Book book3 = new ReferenceBook(7, "HumanBrain", "Reference", true, 240, author2, "Novel");
        PublishingCompany publish1 = new PublishingCompany("Toms");
        Periodical p1 = new Magazine(3, "Troll", "Magazine", true, 125, publish1, "Monthly");
        PublishingCompany publish2 = new PublishingCompany("Petter");
        Periodical p2 = new NewsPaper(6, "Times", "NewsPaper", true, 12, publish2, "Daily");
        System.out.println("My book  is  : " + book1);
        System.out.println("My GeneralBook is  : " + book2);
        System.out.println("My ReferenceBook is : " + book3);
        System.out.println("My Magazine is : " + p1);
        System.out.println("My Newspaper is : " + p2);

        // System.out.println(book1.isLoanable());

    }
}