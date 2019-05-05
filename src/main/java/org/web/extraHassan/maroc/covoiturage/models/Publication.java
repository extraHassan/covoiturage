package org.web.extraHassan.maroc.covoiturage.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Vector;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //not sure about a mother class

    private LocalDateTime datePublication;

    private String title; //short description  to attract people

    private String description;//details

    private Vector<String> images;

    private Vector<String> videos;

    public Publication() {
        System.out.println("Publication created..");
        datePublication=LocalDateTime.now();
    }

    public Publication(String title, String description) {
        this.datePublication = LocalDateTime.now();
        this.title = title;
        this.description = description;
    }

    @ManyToOne
    @JoinColumn(name = "CODE_PUBLISHER")
    private User publisher;


    @OneToMany(fetch = FetchType.LAZY)
    private Vector<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY)
    private Vector<Reaction> reactions;

    @OneToMany(fetch = FetchType.LAZY)
    private Vector<User> usersTagged;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDateTime datePublication) {
        this.datePublication = datePublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vector<String> getImages() {
        return images;
    }

    public void setImages(Vector<String> images) {
        this.images = images;
    }

    public Vector<String> getVideos() {
        return videos;
    }

    public void setVideos(Vector<String> videos) {
        this.videos = videos;
    }

    public User getPublisher() {
        return publisher;
    }

    public void setPublisher(User publisher) {
        this.publisher = publisher;
    }

    public Vector<Comment> getComments() {
        return comments;
    }

    public void setComments(Vector<Comment> comments) {
        this.comments = comments;
    }

    public Vector<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(Vector<Reaction> reactions) {
        this.reactions = reactions;
    }

    public Vector<User> getUsersTagged() {
        return usersTagged;
    }

    public void setUsersTagged(Vector<User> usersTagged) {
        this.usersTagged = usersTagged;
    }
}
