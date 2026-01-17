package com.antonio.automation.models;

public class User {

    private final String username;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String postalCode;

    public User(String username, String password,
                String firstName, String lastName, String postalCode) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static User standardUser() {
        return new User(
                "standard_user",
                "secret_sauce",
                "John",
                "Doe",
                "12345"
        );
    }

    public static User lockedUser() {
        return new User(
                "locked_out_user",
                "secret_sauce",
                "John",
                "Doe",
                "12345"
        );
    }

    public String username() { return username; }
    public String password() { return password; }
    public String firstName() { return firstName; }
    public String lastName() { return lastName; }
    public String postalCode() { return postalCode; }
}