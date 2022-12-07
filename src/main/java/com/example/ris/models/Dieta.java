package com.example.ris.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.*;

@Entity
public class Dieta {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	Collection<RegistriranUporabnik> ima;
	Collection<KrvniTest> doloca;
	Collection<TipDiete> pripada;
	private String naziv;
	private int kalorije;
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

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getKalorije() {
		return this.kalorije;
	}

	public void setKalorije(int kalorije) {
		this.kalorije = kalorije;
	}

	public double getProteini() {
		return this.proteini;
	}

	public void setProteini(double proteini) {
		this.proteini = proteini;
	}

	public boolean isOgljikovi_hidrati() {
		return this.ogljikovi_hidrati;
	}

	public void setOgljikovi_hidrati(boolean ogljikovi_hidrati) {
		this.ogljikovi_hidrati = ogljikovi_hidrati;
	}

	public double getMascobe() {
		return this.mascobe;
	}

	public void setMascobe(double mascobe) {
		this.mascobe = mascobe;
	}

	public double getVlaknine() {
		return this.vlaknine;
	}

	public void setVlaknine(double vlaknine) {
		this.vlaknine = vlaknine;
	}

	public double getSladkorji() {
		return this.sladkorji;
	}

	public void setSladkorji(double sladkorji) {
		this.sladkorji = sladkorji;
	}

	public double getHoresterol() {
		return this.horesterol;
	}

	public void setHoresterol(double horesterol) {
		this.horesterol = horesterol;
	}

	public double getSol() {
		return this.sol;
	}

	public void setSol(double sol) {
		this.sol = sol;
	}

	public double getKalij() {
		return this.kalij;
	}

	public void setKalij(double kalij) {
		this.kalij = kalij;
	}

	public double getVitamin_a() {
		return this.vitamin_a;
	}

	public void setVitamin_a(double vitamin_a) {
		this.vitamin_a = vitamin_a;
	}

	public double getVitamin_b() {
		return this.vitamin_b;
	}

	public void setVitamin_b(double vitamin_b) {
		this.vitamin_b = vitamin_b;
	}

	public double getVitamin_c() {
		return this.vitamin_c;
	}

	public void setVitamin_c(double vitamin_c) {
		this.vitamin_c = vitamin_c;
	}

	public double getZelezo() {
		return this.zelezo;
	}

	public void setZelezo(double zelezo) {
		this.zelezo = zelezo;
	}

	public double getKalcij() {
		return this.kalcij;
	}

	public void setKalcij(double kalcij) {
		this.kalcij = kalcij;
	}

}