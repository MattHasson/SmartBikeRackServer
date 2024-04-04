package com.bikenest.bikerackserver.controller;

import com.bikenest.bikerackserver.model.Rack;
import com.bikenest.bikerackserver.service.RackService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rack")
@CrossOrigin
public class RackController {

    private final RackService rackService;

    public RackController(RackService rackService) {
        this.rackService = rackService;
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException {}

    @GetMapping("")
    public List<Rack> getAllRacks() {
        return rackService.getAllRacks();
    }

    @GetMapping("/{id}")
    public Optional<Rack> getById(@PathVariable int id) throws ResourceNotFoundException {
        if (rackService.getRackById(id).isEmpty()) throw new ResourceNotFoundException();
        else return rackService.getRackById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void postRack(@Valid @RequestBody Rack r) {
        rackService.postRack(r);
    }

    @PutMapping("/{id}")
    public Rack putRack(@PathVariable int id, @Valid @RequestBody Rack r) throws Exception {
        if (rackService.getRackById(id).isEmpty()) throw new ResourceNotFoundException();
        else return rackService.updateRack(id, r);
    }

    @DeleteMapping("/{id}")
    public void deleteRack(@PathVariable int id) {
        if (rackService.getRackById(id).isEmpty()) throw new ResourceNotFoundException();
        else rackService.deleteRackById(id);
    }
    
}
