package com.linedata.ekip.pos.dao.model.impl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ACTION_TYPE")
public class ActionType implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	private String label;
	private float coefficient;
	@OneToOne
	private UnitOfWork unitOfWork;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public float getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}
	public UnitOfWork getUnitOfWork() {
		return unitOfWork;
	}
	public void setUnitOfWork(UnitOfWork unitOfWork) {
		this.unitOfWork = unitOfWork;
	}
}
