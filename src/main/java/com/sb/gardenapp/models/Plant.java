package com.sb.gardenapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Plant {

    @Id
    @GeneratedValue
    private int plantID;

    private String plantName;

}
