package com.bikenest.bikerackserver.model;

import java.time.LocalDateTime;

public record Process(
    Integer id,
    Integer user_id,
    Integer rack_id,
    boolean is_completed,
    LocalDateTime time_start,
    LocalDateTime time_end ) {
}