package com.bikenest.bikerackserver.repository;

import com.bikenest.bikerackserver.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserCollectionRepository {
    private final List<User> userList = new ArrayList<>();

    public UserCollectionRepository() {
    }

    public boolean existsById(Integer id) {
        return userList.stream().filter(u -> u.id().equals(id)).count() == 1;
    }

    public List<User> findAll() { return this.userList; }

    public Optional<User> findById(Integer id) {
        return userList.stream().filter(u -> u.id().equals(id)).findFirst();
    }

    public void save(User user) {
        userList.removeIf(u -> u.id().equals(user.id()));
        userList.add(user);
    }

    public void delete(Integer id) {
        userList.removeIf(u -> u.id().equals(id));
    }

    @PostConstruct
    private void init() {
        User u = new User(1,
                "matth",
                "Matthew",
                "Hasson",
                "password",
                1
                );
        userList.add(u);
    }

}
