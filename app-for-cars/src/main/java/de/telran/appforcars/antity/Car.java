package de.telran.appforcars.antity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

}
