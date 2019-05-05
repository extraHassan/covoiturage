package org.web.extraHassan.maroc.covoiturage.models.embeddables;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Embeddable
public class Car {
    @NotNull
    @Size(max = 100)
    private String name; //ford

    @NotNull
    @Size(max = 100)
    private String model;//focus

    @ElementCollection
    private List<String> images; //not necessary

    public Car() {
        System.out.println("Car created..");
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
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

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
