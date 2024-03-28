package com.bikenest.bikerackserver.controller;

import com.bikenest.bikerackserver.model.Apartment;
import com.bikenest.bikerackserver.service.ApartmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/apartment")
@CrossOrigin
public class ApartmentController {

    private final ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException {}

    @GetMapping("")
    public List<Apartment> getAllApartments() {
        return apartmentService.getAllApartments();
    }

    @GetMapping("/{id}")
    public Optional<Apartment> getById(@PathVariable int id) throws ResourceNotFoundException {
        if (apartmentService.getApartmentById(id).isEmpty()) throw new ResourceNotFoundException();
        else return apartmentService.getApartmentById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void postApartment(@Valid @RequestBody Apartment a) {
        apartmentService.postApartment(a);
    }

    @PutMapping("/{id}")
    public void putApartment(@PathVariable int id, @Valid @RequestBody Apartment a) throws Exception {
        if (apartmentService.getApartmentById(id).isEmpty()) throw new ResourceNotFoundException();
        else apartmentService.updateApartment(id, a);
    }

    @DeleteMapping("/{id}")
    public void deleteApartment(@PathVariable int id) {
        if (apartmentService.getApartmentById(id).isEmpty()) throw new ResourceNotFoundException();
        else apartmentService.deleteApartmentById(id);
    }
    
}
