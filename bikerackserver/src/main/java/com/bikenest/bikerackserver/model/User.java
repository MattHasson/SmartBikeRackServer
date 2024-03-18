package com.bikenest.bikerackserver.model;

public record User (
    Integer id,
    String username,
    String first_name,
    String last_name,
    String password,
    Integer apartment_id) {
}