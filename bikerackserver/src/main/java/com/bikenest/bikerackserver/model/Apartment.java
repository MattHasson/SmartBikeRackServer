package com.bikenest.bikerackserver.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "APARTMENTS")
@AllArgsConstructor
@NoArgsConstructor
public class Apartment {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    @Column(name = "ID")
    private int id;

    @Getter
    @Setter
    @Column(name = "APARTMENT_NAME")
    private String apartmentName;

    @Getter
    @Setter
    @Column(name = "STREET_ADDRESS")
    private String street_address;

    @Getter
    @Setter
    @Column(name = "CITY")
    private String city;

    @Getter
    @Setter
    @Column(name = "ZIP")
    private String zip;
}