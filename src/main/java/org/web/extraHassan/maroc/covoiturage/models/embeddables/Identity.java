package org.web.extraHassan.maroc.covoiturage.models.embeddables;

import org.web.extraHassan.maroc.covoiturage.models.enums.City;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Embeddable
public class Identity {

    @NotNull
    @Size(max = 100)
    private String fullName;

    @NotNull
    private LocalDate birthday;

    private String cne;

    private String mail;

    @NotNull
    @Size(max = 100)
    private String tel;

    private String picture;

    private String slogan; //intro to its profile

    @Enumerated(EnumType.STRING)
    private City city;

    public Identity() {
        System.out.println("Identity created..");
    }

    public Identity(@NotNull @Size(max = 100) String fullName, @NotNull LocalDate birthday) {
        this.fullName = fullName;
        this.birthday = birthday;
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
}
