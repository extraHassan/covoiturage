package org.web.extraHassan.maroc.covoiturage.models;

import org.web.extraHassan.maroc.covoiturage.models.enums.Baggage;
import org.web.extraHassan.maroc.covoiturage.models.enums.PublicationType;
import org.web.extraHassan.maroc.covoiturage.models.enums.PeopleCategory;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@PrimaryKeyJoinColumn(name = "offerId")
public class Offer extends Publication {
    private LocalDateTime dateTime;

    private LocalTime estimatedTime;

    private int places;

    private double price;

    @ManyToOne
    @JoinColumn(name = "CODE_PATH")
    private Path path;

    @ManyToOne
    @JoinColumn(name = "CODE_CAR")
    private Car car;
    @Enumerated(EnumType.STRING)
    private PeopleCategory peopleCategory;

    @Enumerated(EnumType.STRING)
    private Baggage baggage;

    @Enumerated(EnumType.STRING)
    private PublicationType type;

    public Offer(){
        System.out.println("Offer created.. ");
    }

    public Offer(LocalDateTime dateTime, int places, double price) {
        this.dateTime = dateTime;
        this.places = places;
        this.price = price;
    }

    public Offer(String title, String description, LocalDateTime dateTime, int places, double price) {
        super(title, description);
        this.dateTime = dateTime;
        this.places = places;
        this.price = price;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalTime getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(LocalTime estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public PeopleCategory getPeopleCategory() {
        return peopleCategory;
    }

    public void setPeopleCategory(PeopleCategory peopleCategory) {
        this.peopleCategory = peopleCategory;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public PublicationType getType() {
        return type;
    }

    public void setType(PublicationType type) {
        this.type = type;
    }
}
