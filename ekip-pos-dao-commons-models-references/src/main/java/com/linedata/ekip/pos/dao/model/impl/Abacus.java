package com.linedata.ekip.pos.dao.model.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ABACUS")
public class Abacus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long idAbacus;
	
	private float coutH;
	
	@ManyToOne
	private Component component;
	
	@ManyToOne
	private Complexity conplexity;
	
	
	public Abacus(float coutH) {
		super();
		this.coutH = coutH;
	}
	
	public Abacus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdAbacus() {
		return idAbacus;
	}
	public void setIdAbacus(long idAbacus) {
		this.idAbacus = idAbacus;
	}
	public float getCoutH() {
		return coutH;
	}
	public void setCoutH(float coutH) {
		this.coutH = coutH;
	}
	public Component getComponent() {
		return component;
	}
	public void setComponent(Component component) {
		this.component = component;
	}
	public Complexity getConplexity() {
		return conplexity;
	}
	public void setConplexity(Complexity conplexity) {
		this.conplexity = conplexity;
	}

	

}
