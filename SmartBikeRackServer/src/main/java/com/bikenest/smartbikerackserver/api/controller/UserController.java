package com.bikenest.smartbikerackserver.api.controller;

import com.bikenest.smartbikerackserver.api.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UserController {

    // GET method: returns the user based on the username in the request
    // used for login processes
    @GetMapping("/user/{username}")
    public User getUser(@PathVariable String username) {
        // will need to access database to get actual user
        //dummy user created for testing
        return new User(1,"Maya","Wald",username,"mw",1);
    }

    // POST method: creates a new user
    @PostMapping("/user")
    public User newUser(@RequestBody User user) {
        return new User(user);
    }
}
