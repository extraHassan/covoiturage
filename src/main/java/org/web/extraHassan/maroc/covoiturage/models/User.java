package org.web.extraHassan.maroc.covoiturage.models;

import org.web.extraHassan.maroc.covoiturage.models.enums.City;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Vector;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean active;//if he is banned or not
    private String fullName;
    private LocalDate birthday;
    private String cne;
    private String mail;
    private String tel;
    private String picture;
    private String slogan; //intro to its profile

    @Enumerated(EnumType.STRING)
    private City city;

    @OneToMany(fetch = FetchType.LAZY)
    private Vector<Avis> avis;

    @OneToMany(fetch = FetchType.LAZY)
    private Vector<Role> roles; //admin, publisher, driver, traveler

    @OneToMany(fetch = FetchType.LAZY)
    private Vector<Publication> publications;

    public User(){
        System.out.println("user created..");
    }

    public User(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Vector<Avis> getAvis() {
        return avis;
    }

    public void setAvis(Vector<Avis> avis) {
        this.avis = avis;
    }

    public Vector<Role> getRoles() {
        return roles;
    }

    public void setRoles(Vector<Role> roles) {
        this.roles = roles;
    }

    public Vector<Publication> getPublications() {
        return publications;
    }

    public void setPublications(Vector<Publication> publications) {
        this.publications = publications;
    }
}
