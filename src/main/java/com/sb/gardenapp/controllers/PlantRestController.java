package com.sb.gardenapp.controllers;

import com.sb.gardenapp.models.Plant;
import com.sb.gardenapp.services.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/plants")
public class PlantRestController {

    private PlantService service;

    @GetMapping
    public List<Plant> getPlants() {
        return service.getPlants();
    }

    public void setService(PlantService service) {
        this.service = service;
    }

    public PlantRestController(){}

    @Autowired
    public PlantRestController(PlantService service) {
        this.service = service;
    }

}
