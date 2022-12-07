package com.example.ris.models;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.*;

@Entity
public class RegistriranUporabnik {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	Dovoljenje je_potrjeno;
	Collection<Profil> pripada;
	private String ime;
	private String priimek;
	private int id_uporabnik;
	private String email;
	private String geslo;
	private boolean spol;

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

	public int getId_uporabnik() {
		return this.id_uporabnik;
	}

	public void setId_uporabnik(int id_uporabnik) {
		this.id_uporabnik = id_uporabnik;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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