package org.web.extraHassan.maroc.covoiturage.models;

import javax.persistence.*;
import java.util.Vector;
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private Vector<User> users;

    public Role() {
        System.out.println("Role created..");
    }

    public Role(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<User> getUsers() {
        return users;
    }

    public void setUsers(Vector<User> users) {
        this.users = users;
    }
}
