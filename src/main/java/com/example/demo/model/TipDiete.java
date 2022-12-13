package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class TipDiete {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "tipDiete", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Collection<Dieta> dieta;


    private String ime;
    private int rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /*
	 NORMALNA,
	 VEGETARIJANSKA,
	 VEGANSKA,
	 KETO,
	 CARNIVORE;
*/


}

