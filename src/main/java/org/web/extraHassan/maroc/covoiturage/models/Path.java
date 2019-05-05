package org.web.extraHassan.maroc.covoiturage.models;

import javax.persistence.*;
import java.util.Vector;
@Entity
public class Path {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String from;

    private String to;

    private Vector<String> stations;

    @OneToMany(fetch = FetchType.LAZY)
    private Vector<Comment> comments;

    public Path() {
        System.out.println("Path created..");
    }

    public Path(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Vector<String> getStations() {
        return stations;
    }

    public void setStations(Vector<String> stations) {
        this.stations = stations;
    }

    public Vector<Comment> getComments() {
        return comments;
    }

    public void setComments(Vector<Comment> comments) {
        this.comments = comments;
    }
}
