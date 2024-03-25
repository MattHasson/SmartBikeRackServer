package com.bikenest.bikerackserver.repository;

import com.bikenest.bikerackserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public Boolean existsByUsername(String username);
}
