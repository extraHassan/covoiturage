package org.web.extraHassan.maroc.covoiturage.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //not sure about a mother class

    private LocalDateTime datePublication;

    private String title; //short description  to attract people

    private String description;//details

    @ElementCollection
    private Set<String> images;

    @ElementCollection
    private Set<String> videos;


    @ManyToOne
    @JoinColumn(name = "CODE_PUBLISHER")
    private User publisher;


    @OneToMany(fetch = FetchType.LAZY)
    private Set<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Reaction> reactions;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<User> usersTagged;


    public Publication() {
        System.out.println("Publication created..");
        datePublication=LocalDateTime.now();
    }

    public Publication(String title, String description) {
        this.datePublication = LocalDateTime.now();
        this.title = title;
        this.description = description;
    }

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

    public Set<String> getImages() {
        return images;
    }

    public void setImages(Set<String> images) {
        this.images = images;
    }

    public Set<String> getVideos() {
        return videos;
    }

    public void setVideos(Set<String> videos) {
        this.videos = videos;
    }

    public User getPublisher() {
        return publisher;
    }

    public void setPublisher(User publisher) {
        this.publisher = publisher;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(Set<Reaction> reactions) {
        this.reactions = reactions;
    }

    public Set<User> getUsersTagged() {
        return usersTagged;
    }

    public void setUsersTagged(Set<User> usersTagged) {
        this.usersTagged = usersTagged;
    }
}
