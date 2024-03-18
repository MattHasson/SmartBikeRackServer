package com.bikenest.bikerackserver.model;

public record Rack(
    Integer id,
    String name,
    boolean is_open,
    Integer apartment_id) {
}