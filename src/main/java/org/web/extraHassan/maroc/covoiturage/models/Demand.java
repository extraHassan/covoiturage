package org.web.extraHassan.maroc.covoiturage.models;

import org.web.extraHassan.maroc.covoiturage.models.enums.Baggage;
import org.web.extraHassan.maroc.covoiturage.models.enums.PublicationType;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@PrimaryKeyJoinColumn(name = "demandId")
public class Demand extends Publication {
    private LocalDateTime dateTime;

    private int places;// if you want to post a demand with a specific number of places

    @ManyToOne
    @JoinColumn(name = "CODE_PATH")
    private Path path;

    @Enumerated(EnumType.STRING)
    private PublicationType type;

    @Enumerated(EnumType.STRING)
    private Baggage baggage;

    public Demand(){
        System.out.println("Demand created..");
    }
    public Demand(LocalDateTime dateTime, int places) {
        this.dateTime = dateTime;
        this.places = places;
    }

    public Demand(String title, String description, LocalDateTime dateTime, int places) {
        super(title, description);
        this.dateTime = dateTime;
        this.places = places;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public PublicationType getType() {
        return type;
    }

    public void setType(PublicationType type) {
        this.type = type;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }
}
