package com.sb.gardenapp.daos;

import com.sb.gardenapp.models.Plant;

import javax.persistence.EntityManager;

public class PlantsDaoImpl implements PlantsDao {

    private final EntityManager entityManager;

    public PlantsDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Plant plant) {
        entityManager.persist(plant);
    }

    @Override
    public Plant read(Long id) {
        return entityManager.find(Plant.class, id);
    }

    @Override
    public void update(Plant plant) {

    }

    @Override
    public void delete(String plantName) {

    }
}
