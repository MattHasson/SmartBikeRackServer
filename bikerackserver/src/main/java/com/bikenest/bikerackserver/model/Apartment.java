package com.bikenest.bikerackserver.model;

public record Apartment (
    Integer id,
    String apartment_name,
    String street_address,
    String city,
    String zip) {
}