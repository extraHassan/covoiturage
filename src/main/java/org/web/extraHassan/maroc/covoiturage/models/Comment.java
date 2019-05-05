package org.web.extraHassan.maroc.covoiturage.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name ="CODE_USER")
    private User user;

    @ManyToOne
    @JoinColumn(name = "CODE_PUBLICATION")
    private Publication publication;

    public Comment(){
        System.out.println("Comment created..");
        dateTime=LocalDateTime.now();
    }

    public Comment(String text) {
        dateTime=LocalDateTime.now();
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }
}
