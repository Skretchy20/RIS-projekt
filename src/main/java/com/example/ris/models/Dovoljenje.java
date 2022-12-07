package com.example.ris.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dovoljenje {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	private int identiteta;
	private String vloga;
	private String opis;

	public int getId() {
		return this.identiteta;
	}

	public void setId(int identiteta) {
		this.identiteta = identiteta;
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