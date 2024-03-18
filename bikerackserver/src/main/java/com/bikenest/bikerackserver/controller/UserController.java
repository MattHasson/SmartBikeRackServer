package com.bikenest.bikerackserver.controller;

import com.bikenest.bikerackserver.model.User;
import com.bikenest.bikerackserver.repository.UserCollectionRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

    private final UserCollectionRepository repository;

    public UserController(UserCollectionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<User> findAll() { return repository.findAll(); }

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CONTENT NOT FOUND"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void update(@Valid @RequestBody User user) {
        repository.save(user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody User user, @PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content Not Found");
        }
        repository.save(user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content Not Found");
        }
        repository.delete(id);
    }

}
