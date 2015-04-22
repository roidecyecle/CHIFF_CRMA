package com.linedata.ekip.pos.dao.model.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@OneToMany(fetch=FetchType.LAZY,
			   targetEntity=UnitOfWork.class,
			   mappedBy="actionType")
	private Collection<UnitOfWork> unitsOfWorks;
	
	
	
	
	public ActionType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ActionType(String label, float coefficient) {
		super();
		this.label = label;
		this.coefficient = coefficient;
	}
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

	public Collection<UnitOfWork> getUnitsOfWorks() {
		return unitsOfWorks;
	}

	public void setUnitsOfWorks(Collection<UnitOfWork> unitsOfWorks) {
		this.unitsOfWorks = unitsOfWorks;
	}

}
