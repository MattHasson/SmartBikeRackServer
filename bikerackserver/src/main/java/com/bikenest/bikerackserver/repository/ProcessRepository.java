package com.bikenest.bikerackserver.repository;

import com.bikenest.bikerackserver.model.Process;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Integer> {

}
