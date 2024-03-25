package com.bikenest.bikerackserver.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Entity
@Table(name = "RACKS")
@AllArgsConstructor
@NoArgsConstructor
public class Rack {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    @Column(name = "ID")
    int id;

    @Getter
    @Setter
    @Column(name = "NAME")
    String name;

    @Getter
    @Setter
    @Column(name = "IS_OPEN")
    Boolean is_open;

    @Getter
    @Setter
    @Column(name = "APARTMENT_ID")
    int apartment_id;
}

/*public record Rack(
    Integer id,
    String name,
    boolean is_open,
    Integer apartment_id) {
}*/