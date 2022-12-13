package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.*;

@Entity
//@Table(name = "krvnitest")
public class KrvniTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long krvniTestId;


//    @ManyToMany(mappedBy = "krvni_test", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "dietetik_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
//    Dietetik dietetik;
    Collection<Dietetik> dietetik;


//    @ManyToMany
//    @JoinTable(name = "krvnitesti_dietetiki", joinColumns = @JoinColumn(name = "krvni_test_id"), inverseJoinColumns = @JoinColumn(name = "dietetik_id"))
//    private List<Dietetik> Dietetiki = new ArrayList<>();


    public Long getId() {
        return krvniTestId;
    }

    public void setId(Long krvniTestId) {
        this.krvniTestId = krvniTestId;
    }





//    @JsonIgnore
//    @ManyToMany(mappedBy = "krvniTesti")
//    private Set<Dietetik> dietetiki = new HashSet<>();


    private int identiteta;
    private int krvnaSkupina;
    private int letnik;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;


//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    /*
    // Getter for Dietetik
    public Set<Dietetik> getDietetiki() {
        return dietetiki;
    }
     */

    public Date getDate() { return  this.date;}

    public void setDate(Date date) { this.date = date; }

    public int getIdentiteta() {
        return this.identiteta;
    }

    public void setIdentiteta(int identiteta) {
        this.identiteta = identiteta;
    }

    public int getKrvnaSkupina() {
        return krvnaSkupina;
    }

    public void setKrvnaSkupina(int krvnaSkupina) {
        this.krvnaSkupina = krvnaSkupina;
    }

    public int getLetnik() {
        return letnik;
    }

    public void setLetnik(int letnik) {
        this.letnik = letnik;
    }

    public void analiza() {
        // TODO - implement KrvniTest.analiza
        throw new UnsupportedOperationException();
    }


}

