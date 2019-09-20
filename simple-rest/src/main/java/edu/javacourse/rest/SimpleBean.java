package edu.javacourse.rest;

public class SimpleBean
{
    private String firstName;
    private String lastName;

    public SimpleBean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
