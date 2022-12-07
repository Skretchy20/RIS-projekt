package com.example.ris.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public enum TipDiete {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)



	 NORMALNA,
	 VEGETARIJANSKA,
	 VEGANSKA,
	 KETO,
	 CARNIVORE;

	private Long id;

}