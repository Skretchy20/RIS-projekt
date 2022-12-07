package com.example.ris.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.*;

@Entity
public class KrvniTest {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;


	Dovoljenje dovoljuje;
	Collection<Dietetik> dostopa;
	private int identiteta;
	private date datum;

	public int getId() {
		return this.identiteta;
	}

	public void setId(int identiteta) {
		this.identiteta = identiteta;
	}

	public date getDatum() {
		return this.datum;
	}

	public void setDatum(date datum) {
		this.datum = datum;
	}


	public class date {
		Date date = new Date();
	}

	public void analiza() {
		// TODO - implement KrvniTest.analiza
		throw new UnsupportedOperationException();
	}

}