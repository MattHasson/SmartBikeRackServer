package com.bikenest.smartbikerackserver.api.model;

public class Rack {
    private int id;
    private String rack_name;
    private boolean is_open;
    private int apartment_id;

    public Rack(int id, String rack_name, boolean is_open, int apartment_id) {
        this.id = id;
        this.rack_name = rack_name;
        this.is_open = is_open;
        this.apartment_id = apartment_id;
    }
    public Rack() {
        this.id = 0;
        this.rack_name = null;
        this.is_open = true;
        this.apartment_id = 0;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getRack_name() {
        return rack_name;
    }
    public void setRack_name(String rack_name) {
        this.rack_name = rack_name;
    }

    public boolean is_open() {
        return is_open;
    }
    public void setIs_open(boolean is_open) {
        this.is_open = is_open;
    }

    public int getApartment_id() {
        return apartment_id;
    }
    public void setApartment_id(int apartment_id) {
        this.apartment_id = apartment_id;
    }
}
