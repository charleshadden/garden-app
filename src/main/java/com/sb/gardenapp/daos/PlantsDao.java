package com.sb.gardenapp.daos;

import com.sb.gardenapp.models.Plant;
import org.springframework.stereotype.Component;

@Component
public interface PlantsDao {

    void create(Plant plant);

    Plant read(Long id);

    void update(Plant plant);

    void delete(String plantName);
}
