package com.bikenest.bikerackserver.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

@Data
@Entity
@Table(name = "USERS")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    @Column(name = "ID")
    private int id;

    @Column(unique = true, name = "USERNAME")
    @NotBlank
    @Getter
    @Setter
    private String username;

    @Column(name = "FIRST_NAME")
    @Getter
    @Setter
    private String first_name;

    @Column(name = "LAST_NAME")
    @Getter
    @Setter
    private String last_name;

    @Column(name = "PASSWORD")
    @NotBlank
    @Getter
    @Setter
    private String password;

    @Column(name = "APARTMENT_ID")
    @Getter
    @Setter
    private Integer apartment_id;
}