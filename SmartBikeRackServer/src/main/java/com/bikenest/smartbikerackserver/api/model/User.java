package com.bikenest.smartbikerackserver.api.model;

public class User {

    private int id;
    private String first_name;
    private String last_name;
    private String password;
    private int apartment_id;

    public User(User user) {
        this.id = user.id;
        this.first_name = user.first_name;
        this.last_name = user.last_name;
        this.password = user.password;
        this.apartment_id = user.apartment_id;
    }
    public User() {
        this.id = 0;
        this.first_name = null;
        this.last_name = null;
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
