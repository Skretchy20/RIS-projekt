package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Collection;

@Entity
public class RegistriranUporabnik {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "registriranUporabnik", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Collection<Profil> profili;

    private String ime;

    private String priimek;
    private String email;
    private String geslo;
    private boolean spol;


    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Profil> getProfili() { return profili;}

    public String getIme() { return this.ime;}

    public String getEmail() {return  this.email;}

    public String setEmail() {return  this.email;}

    public String getGeslo() {
        return this.geslo;
    }

    public void setGeslo(String geslo) {
        this.geslo = geslo;
    }

    public boolean isSpol() {
        return this.spol;
    }

    public void setSpol(boolean spol) {
        this.spol = spol;
    }

    public void upravljanjeProfila() {
        // TODO - implement RegistriranUporabnik.upravljanjeProfila
        throw new UnsupportedOperationException();
    }

    public void ocenjevanjeDiet() {
        // TODO - implement RegistriranUporabnik.ocenjevanjeDiet
        throw new UnsupportedOperationException();
    }

    public void filtriranjeDiet() {
        // TODO - implement RegistriranUporabnik.filtriranjeDiet
        throw new UnsupportedOperationException();
    }

    public void izracunKalorij() {
        // TODO - implement RegistriranUporabnik.izra�unKalorij
        throw new UnsupportedOperationException();
    }

    public void postavljanjeVprasanj() {
        // TODO - implement RegistriranUporabnik.postavljanjeVpra�anj
        throw new UnsupportedOperationException();
    }
}
