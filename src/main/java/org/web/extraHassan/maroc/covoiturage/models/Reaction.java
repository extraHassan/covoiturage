package org.web.extraHassan.maroc.covoiturage.models;

import org.web.extraHassan.maroc.covoiturage.models.enums.Emote;

import javax.persistence.*;

@Entity
public class Reaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CODE_USER")
    private  User user;

    @Enumerated(EnumType.STRING)
    private  Emote emote;

    public Reaction() {
        System.out.println("Reaction created..");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Emote getEmote() {
        return emote;
    }

    public void setEmote(Emote emote) {
        this.emote = emote;
    }
}
