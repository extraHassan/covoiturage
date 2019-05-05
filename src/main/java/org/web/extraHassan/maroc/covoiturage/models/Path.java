package org.web.extraHassan.maroc.covoiturage.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Path {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String start;

    private String end;

    @ElementCollection
    private Set<String> stations;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Demand> demands;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Offer> offers;


    public Path() {
        System.out.println("Path created..");
    }

    public Path(String start, String end) {
        this.start = start;
        this.end= end;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Set<String> getStations() {
        return stations;
    }

    public void setStations(Set<String> stations) {
        this.stations = stations;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Demand> getDemands() {
        return demands;
    }

    public void setDemands(Set<Demand> demands) {
        this.demands = demands;
    }

    public Set<Offer> getOffers() {
        return offers;
    }

    public void setOffers(Set<Offer> offers) {
        this.offers = offers;
    }
}
