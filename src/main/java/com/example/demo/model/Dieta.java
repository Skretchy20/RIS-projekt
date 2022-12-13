package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Collection;

@Entity
public class Dieta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipDiete_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    TipDiete tipDiete;

    private String naziv;
    private int kalorije;

    /*
    *
    *
    *
    *
    *
    * /repozetorij #ISZZP123-2 DONE Time 1h
    private double proteini;
    private boolean ogljikovi_hidrati;
    private double mascobe;
    private double vlaknine;
    private double sladkorji;
    private double horesterol;
    private double sol;
    private double kalij;
    private double vitamin_a;
    private double vitamin_b;
    private double vitamin_c;
    private double zelezo;
    private double kalcij;

     */




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) { this.naziv = naziv;}

    public int getKalorije() { return this.kalorije;}

    public void setKalorije(int kalorije) {this.kalorije = kalorije;}

}
