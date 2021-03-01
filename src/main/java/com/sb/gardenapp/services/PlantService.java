package com.sb.gardenapp.services;

import com.sb.gardenapp.daos.PlantsDao;
import com.sb.gardenapp.models.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class PlantService {

    private PlantsDao dao;

    public List<Plant> getPlants() {
        return dao.getAllPlants();
    }

    public void setDao(PlantsDao dao) {
        this.dao = dao;
    }

    public PlantService(){}

    @Autowired
    public PlantService(PlantsDao dao) {
        this.dao = dao;
    }
}
