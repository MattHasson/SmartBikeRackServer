package com.bikenest.bikerackserver.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "APARTMENTS")
@AllArgsConstructor
@NoArgsConstructor
public class Apartment {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "APARTMENT_NAME")
    private String apartmentName;
    @Column(name = "STREET_ADDRESS")
    private String street_address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ZIP")
    private String zip;
}