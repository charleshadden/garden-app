package com.sb.gardenapp.repositories;

import com.sb.gardenapp.models.Plant;

public interface PlantsRepository {

    Plant get(Long id);

    void add(Plant user);

    void update(Plant user);

    void remove(Plant user);

    Plant findByPlantName(String plantName);

}
