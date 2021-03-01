package com.sb.gardenapp.controllers;

import com.sb.gardenapp.exceptions.ResourceNotFoundException;
import com.sb.gardenapp.models.Plant;
import com.sb.gardenapp.services.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plants")
public class PlantRestController {

    @Autowired
    PlantService service;


    @GetMapping("/{id}")
    public ResponseEntity<Plant> getPlantById(@PathVariable long id) throws ResourceNotFoundException {
        Plant plant = service.getPlantById(id).orElseThrow(() -> new ResourceNotFoundException("Plant not found for this id : " + id));
        return ResponseEntity.ok().body(plant);
    }

    @GetMapping
    public List<Plant> getAllPlants() {
        return service.getAllPlants();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePlantById(@PathVariable long id){
        service.deletePlantById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Plant addPlant(@RequestBody Plant plant) {
        return service.addPlant(plant);
    }

    @GetMapping("/plantName/{plantName}")
    public List<Plant> getPlantByPlantName(@PathVariable String plantName) {
        return service.getPlantByPlantName(plantName);
    }

}
