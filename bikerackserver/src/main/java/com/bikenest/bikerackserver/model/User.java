package com.bikenest.bikerackserver.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "USERS")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "USERNAME")
    @NotBlank
    private String username;
    @Column(name = "FIRST_NAME")
    private String first_name;
    @Column(name = "LAST_NAME")
    private String last_name;
    @Column(name = "PASSWORD")
    @NotBlank
    private String password;
    @Column(name = "APARTMENT_ID")
    private Integer apartment_id;
}