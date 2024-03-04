package com.bikenest.smartbikerackserver.api.controller;

import com.bikenest.smartbikerackserver.api.model.Apartment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class ApartmentController {

    // GET method: should return all apartments in database
    @GetMapping("/apartments")
    public List<Apartment> apartment() {
        // dummy apartments created for testing
        Apartment apartment1 = new Apartment(1,"Woodbridge","211 W Burleigh Ave", "Bismarck", "58504");
        Apartment apartment2 = new Apartment(2,"Citadel","211 W Burleigh Ave", "Bismarck", "58504");

        return List.of(apartment1, apartment2);
    }
}
