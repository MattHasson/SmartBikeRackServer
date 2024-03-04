package com.bikenest.smartbikerackserver.api.model;

public class User {

    private int id;
    private String first_name;
    private String last_name;



    private String username;
    private String password;
    private int apartment_id;

    public User(int id, String first_name, String last_name, String username, String password, int apartment_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.apartment_id = apartment_id;
    }

    public User(User user) {
        this.id = user.id;
        this.first_name = user.first_name;
        this.last_name = user.last_name;
        this.username = user.username;
        this.password = user.password;
        this.apartment_id = user.apartment_id;
    }
    public User() {
        this.id = 0;
        this.first_name = null;
        this.last_name = null;
        this.username = null;
        this.password = null;
        this.apartment_id = 0;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getFirst_name() {
        return first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getLast_name() {
        return last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public int getApartment_id() {
        return apartment_id;
    }
    public void setApartment_id(int apartment_id) {
        this.apartment_id = apartment_id;
    }
}
