package com.bikenest.bikerackserver.service;

import com.bikenest.bikerackserver.model.Rack;
import com.bikenest.bikerackserver.repository.RackRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RackService {
    private final RackRepository rackRepository;

    public RackService(RackRepository rackRepository) {
        this.rackRepository = rackRepository;
    }

    public void postRack(Rack rack) {
        rackRepository.save(rack);
    }

    public Optional<Rack> getRackById(int id) {
        return rackRepository.findById(id);
    }

    public List<Rack> getAllRacks() {
        return rackRepository.findAll();
    }

    public Rack updateRack(int id, Rack rack) {
        rack.setId(id);
        return rackRepository.save(rack);
    }

    public void deleteRackById(int id) {
        rackRepository.deleteById(id);
    }

}
