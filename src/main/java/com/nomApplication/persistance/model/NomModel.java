package com.nomApplication.persistance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NomModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String attributUtilisateur;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttributUtilisateur() {
		return attributUtilisateur;
	}

	public void setAttributUtilisateur(String attributUtilisateur) {
		this.attributUtilisateur = attributUtilisateur;
	}

	public NomModel(Long id, String attributUtilisateur) {
		super();
		this.id = id;
		this.attributUtilisateur = attributUtilisateur;
	}

	public NomModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
