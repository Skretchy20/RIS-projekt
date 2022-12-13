package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Dovoljenje {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int identiteta;
    private String vloga;
    private String opis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId(int id) {
        this.identiteta = id;
    }

    public String getVloga() {
        return this.vloga;
    }

    public void setVloga(String vloga) {
        this.vloga = vloga;
    }

    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
