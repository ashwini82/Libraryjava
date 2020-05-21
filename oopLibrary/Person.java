package oopLibrary;

import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private int personId;
    private Date joinDate;

    public Person(String firstName, String lastName, int personId, Date joinDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personId = personId;
        this.joinDate = joinDate;
    }

    // getter//
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPersonId() {
        return personId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    // setter//
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}