package com.bikenest.bikerackserver.repository;

import com.bikenest.bikerackserver.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {

}
