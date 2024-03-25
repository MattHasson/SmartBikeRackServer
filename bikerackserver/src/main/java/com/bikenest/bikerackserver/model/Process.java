package com.bikenest.bikerackserver.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PROCESSES")
@AllArgsConstructor
@NoArgsConstructor
public class Process {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    @Column(name = "ID")
    int id;

    @Getter
    @Setter
    @Column(name = "USER_ID")
    int user_id;

    @Getter
    @Setter
    @Column(name = "RACK_ID")
    int rack_id;

    @Getter
    @Setter
    @Column(name = "IS_COMPLETED")
    Boolean is_completed;

    @Getter
    @Setter
    @Column(name = "TIME_START")
    LocalDateTime time_start;

    @Getter
    @Setter
    @Column(name = "TIME_END")
    LocalDateTime time_end;


}

/*
public record Process(
    Integer id,
    Integer user_id,
    Integer rack_id,
    boolean is_completed,
    LocalDateTime time_start,
    LocalDateTime time_end ) {
} */