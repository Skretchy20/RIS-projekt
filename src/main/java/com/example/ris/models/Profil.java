package com.example.ris.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profil {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	Dietetik ima;
	private int tip;
	private String lastnik;
	private int stProfilov;

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

}