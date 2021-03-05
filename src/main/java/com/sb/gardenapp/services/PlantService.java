package com.sb.gardenapp.services;

import com.sb.gardenapp.models.Plant;
import com.sb.gardenapp.repositories.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    @Autowired
    private PlantRepository repository;


    public Optional<Plant> getPlantById(long id) {
        return repository.findById(id);
    }

    public List<Plant> getAllPlants(){
        return repository.findAll();
    }

    public void deletePlantById(long id){
        repository.deleteById(id);
    }

    public void savePlant(Plant plant) {
        repository.save(plant);
    }

    public Plant addPlant(Plant plant) {
        return repository.save(plant);
    }

    public List<Plant> getPlantByPlantName(String plantName) {
        return repository.findByPlantName(plantName);
    }
}
