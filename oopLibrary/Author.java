package oopLibrary;

public class Author {
    String firstName;
    String lastName;

    public Author() {
        this.firstName = "Jack";
        this.lastName = "potter";
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getAuthor() {
        return firstName + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return getAuthor();
    }
}