package com.example.smartbikerackserver.api.model;

import java.time.LocalDateTime;

public class Process {
    private int id;
    private int user_id;
    private int rack_id;
    private boolean is_completed;
    private LocalDateTime start_time;
    private LocalDateTime end_time;

    public Process(int id, int user_id, int rack_id, boolean is_completed, LocalDateTime start_time, LocalDateTime end_time) {
        this.id = id;
        this.user_id = user_id;
        this.rack_id = rack_id;
        this.is_completed = is_completed;
        this.start_time = start_time;
        this.end_time = end_time;
    }
    public Process() {
        this.id = 0;
        this.user_id = 0;
        this.rack_id = 0;
        this.is_completed = false;
        this.start_time = null;
        this.end_time = null;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRack_id() {
        return rack_id;
    }
    public void setRack_id(int rack_id) {
        this.rack_id = rack_id;
    }

    public boolean is_completed() {
        return is_completed;
    }
    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    public LocalDateTime getStart_time() {
        return start_time;
    }
    public void setStart_time(LocalDateTime start_time) {
        this.start_time = start_time;
    }

    public LocalDateTime getEnd_time() {
        return end_time;
    }
    public void setEnd_time(LocalDateTime end_time) {
        this.end_time = end_time;
    }
}
