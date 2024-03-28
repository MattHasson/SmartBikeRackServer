package com.bikenest.bikerackserver.service;

import com.bikenest.bikerackserver.model.Apartment;
import com.bikenest.bikerackserver.repository.ApartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public void postApartment(Apartment apartment) {
        apartmentRepository.save(apartment);
    }

    public Optional<Apartment> getApartmentById(int id) {
        return apartmentRepository.findById(id);
    }

    public List<Apartment> getAllApartments() {
        return apartmentRepository.findAll();
    }

    public void updateApartment(int id, Apartment apartment) {
        apartment.setId(id);
        apartmentRepository.save(apartment);
    }

    public void deleteApartmentById(int id) {
        apartmentRepository.deleteById(id);
    }

}
