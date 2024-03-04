package com.bikenest.smartbikerackserver.api.controller;

import com.bikenest.smartbikerackserver.api.enums.LockStatus;
import com.bikenest.smartbikerackserver.api.model.User;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class LockStatusController {

    // GET: gets lock status based on user in request
    @GetMapping("/lockStatus/{user}")
    public LockStatus lockStatus(@PathVariable User user) {
        // will need to look at user id then connect to most recent process
        return LockStatus.LOCKED;
    }

    // POST: starts process for lock
    @PostMapping("/lockStatus")
    public LockStatus lockStatus(@RequestParam String lockStatus) {
        // will need to look at user id then connect to most recent process
        return LockStatus.LOCKED;
    }
}

