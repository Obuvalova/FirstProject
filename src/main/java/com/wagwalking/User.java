package com.wagwalking;

public class User {

    private String email;
    private String firstName;
    private  String lastName;
    private String phone;
    private String password;

    public User(String email,String firstName,String lastName,String password,String phone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getPhone() {
        return phone;
    }
    public String getPassword() {
        return password;
    }
    public String getLastName() {
        return lastName;
    }




















}
