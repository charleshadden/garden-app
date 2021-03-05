package com.sb.gardenapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "plants")
public class Plant {

    @Id
    @GeneratedValue
    @Column(name = "plant_id")
    private long plantID;

    @Column(name = "plant_name")
    private String plantName;

}
