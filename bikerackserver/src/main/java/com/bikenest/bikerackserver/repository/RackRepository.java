package com.bikenest.bikerackserver.repository;

import com.bikenest.bikerackserver.model.Rack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RackRepository extends JpaRepository<Rack, Integer> {

}
