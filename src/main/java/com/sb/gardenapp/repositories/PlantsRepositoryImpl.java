package com.sb.gardenapp.repositories;

import com.sb.gardenapp.daos.PlantsDaoImpl;
import com.sb.gardenapp.models.Plant;

public class PlantsRepositoryImpl implements PlantsRepository {

    private PlantsDaoImpl plantsDaoImpl;

    @Override
    public Plant get(Long id) {
        Plant plant =  plantsDaoImpl.read(id);

        return plant;
    }

    @Override
    public void add(Plant plant) {
        plantsDaoImpl.create(plant);
    }

    @Override
    public void remove(Plant plant) {

    }

    @Override
    public void update(Plant plant) {

    }

    @Override
    public Plant findByPlantName(String plantName) {
        return null;
    }
}
