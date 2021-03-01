package com.sb.gardenapp.controllers;

import com.sb.gardenapp.models.Plant;
import com.sb.gardenapp.repositories.PlantsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plants")
public class PlantRestController {

    private PlantsRepository plantsRepository;

    PlantRestController(PlantsRepository plantsRepository) {
        this.plantsRepository = plantsRepository;
    }

    @GetMapping("/plants/id")
    public Plant getPlantByID(Long id) {

        return plantsRepository.get(id);
    }

    public void setService(PlantsRepository plantsRepository) {

        this.plantsRepository = plantsRepository;
    }

    public PlantRestController(){}


}
