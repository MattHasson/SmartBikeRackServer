package com.bikenest.smartbikerackserver.api.model;

public class Apartment {
    private int id;
    private String apartment_name;
    private String street_address;
    private String city;
    private String zip;

    public Apartment(int id, String apartment_name, String street_address, String city, String zip) {
        this.id = id;
        this.apartment_name = apartment_name;
        this.street_address = street_address;
        this.city = city;
        this.zip = zip;
    }
    public Apartment() {
        this.id = 0;
        this.apartment_name = null;
        this.street_address = null;
        this.city = null;
        this.zip = null;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getApartment_name() {
        return apartment_name;
    }
    public void setApartment_name(String apartment_name) {
        this.apartment_name = apartment_name;
    }

    public String getStreet_address() {
        return street_address;
    }
    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
}
