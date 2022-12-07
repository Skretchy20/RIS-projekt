package com.example.ris.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.*;

@Entity
public class Dietetik extends RegistriranUporabnik {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	Collection<KrvniTest> so_analizirani;
	Collection<Profil> pripada;
	private String ime;
	private String priimek;
	private int id_dietetik;
	private String email;
	private String uporabniskoIme;
	private String geslo;

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

	public int getId_dietetik() {
		return this.id_dietetik;
	}

	public void setId_dietetik(int id_dietetik) {
		this.id_dietetik = id_dietetik;
	}

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
		// TODO - implement Dietetik.odgovorNaVpra�anj
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

}