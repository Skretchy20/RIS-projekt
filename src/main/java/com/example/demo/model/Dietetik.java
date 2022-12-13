package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.*;

@Entity
//@Table(name = "dietetik")
public class Dietetik {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dietetik_id;


    @ManyToMany(mappedBy = "dietetik", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<KrvniTest> krvnitests;

    public Long getId() {
        return dietetik_id;
    }

    public void setId(Long dietetik_id) {
        this.dietetik_id = dietetik_id;
    }



    /*
    // Povezava med dietetikom pa krvnimi testi (vec dietetikov lahk ma vec testov)
    @ManyToMany
    @JoinTable(
        name="dodeljeni_testi",
            joinColumns = @JoinColumn(name = "dietetik_id"),
            inverseJoinColumns = @JoinColumn(name = "krvniTest_id")
    )
    private Set<KrvniTest> krvniTesti = new HashSet<>();

     */

/*
    // Povezava med dietetikom in profilom (en dietetik lahk ma vec profilov
    @OneToMany(mappedBy = "dietetik", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Collection<Profil> profili;


 */



//    private Set<Profil> profili = new HashSet<>();



    private String ime;
    private String priimek;
//    private int id_dietetik;
    private String email;
    private String uporabniskoIme;
    private String geslo;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    /*
    // Getter for Krvni Testi
    public Set<KrvniTest> getKrvniTesti(){
        return krvniTesti;
    }

     */

    /*
    // Getter for Profili
    public Set<Profil> getProfili() {
        return profili;
    }
     */

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPriimek() {
        return this.priimek;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

//    public int getId_dietetik() {
//        return this.id_dietetik;
//    }
//
//    public void setId_dietetik(int id_dietetik) {
//        this.id_dietetik = id_dietetik;
//    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUporabniskoIme() {
        return this.uporabniskoIme;
    }

    public void setUporabniskoIme(String uporabniskoIme) {
        this.uporabniskoIme = uporabniskoIme;
    }

    public String getGeslo() {
        return this.geslo;
    }

    public void setGeslo(String geslo) {
        this.geslo = geslo;
    }

    public void odgovorNaVprasanj() {
        // TODO - implement Dietetik.odgovorNaVprasanj
        throw new UnsupportedOperationException();
    }

    public void analizaKrvnegaTesta() {
        // TODO - implement Dietetik.analizaKrvnegaTesta
        throw new UnsupportedOperationException();
    }

    public void upravljanjeDiet() {
        // TODO - implement Dietetik.upravljanjeDiet
        throw new UnsupportedOperationException();
    }

    /*
    public void dodajKrvniTest(KrvniTest krvniTest) {
        krvniTesti.add(krvniTest);
    }

     */
}


