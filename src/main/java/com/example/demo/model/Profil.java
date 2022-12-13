package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Profil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int tip;

    private String lastnik;
    private int stProfilov;

    // Povezava med profilom in registriranim uporabnikom (registriran up. ima vec profilov)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registriranUporabnik_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    RegistriranUporabnik registriranUporabnik;



    /*
    // Povezava med dietetikom in profilom (en dietetik lahk ma vec profilov)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dietetik_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    Dietetik dietetik;
     */


    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public RegistriranUporabnik getRegistriranUporabnik() { return registriranUporabnik;}

    public void setRegistriranUporabnik(RegistriranUporabnik registriranUporabnik){ this.registriranUporabnik = registriranUporabnik;}

    /*
    public Dietetik getDietetik(){
        return dietetik;
    }
     */
    public int getTip() {
        return this.tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public int getStProfilov() {
        return this.stProfilov;
    }

    public void setStProfilov(int stProfilov) {
        this.stProfilov = stProfilov;
    }

    public void spremeniVlogo() {
        // TODO - implement Profil.spremeniVlogo
        throw new UnsupportedOperationException();
    }

    /*
    public void dodajDietetika(Dietetik dietetik) {
        this.dietetik = dietetik;
    }
     */
}
