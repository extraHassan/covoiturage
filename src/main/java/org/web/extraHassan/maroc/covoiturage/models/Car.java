package org.web.extraHassan.maroc.covoiturage.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Vector;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; //ford

    private String model;//focus

    private Vector<String> images; //not necessary

    public Car() {
        System.out.println("Car created..");
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vector<String> getImages() {
        return images;
    }

    public void setImages(Vector<String> images) {
        this.images = images;
    }
}
