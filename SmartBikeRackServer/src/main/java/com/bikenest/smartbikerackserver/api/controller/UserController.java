package com.bikenest.smartbikerackserver.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UserController {
    @GetMapping("/users")
    public List<String> user() {
        return List.of("SERVICE REACHED");
    }
}
