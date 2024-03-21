package com.bikenest.bikerackserver.service;

import com.bikenest.bikerackserver.model.User;
import com.bikenest.bikerackserver.repository.UserRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void postUser(User user) {
        userRepository.save(user);
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Modifying
    public void updateUser(int id, User user) throws Exception{
        //Put update code in here, probably something with finding by ID then saving
    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }


}
