package com.sb.gardenapp.controllers;

import com.sb.gardenapp.models.Plant;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        Plant plant1 = new Plant();
        plant1.setPlantID(1);
        plant1.setPlantName("Tomato");
        return "HELLO WORLD!!!" + plant1.getPlantName();
    }

}