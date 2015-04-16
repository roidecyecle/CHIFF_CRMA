package com.linedata.ekip.pos.dao.model.impl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="UNIT_OF_WORK")
public class UnitOfWork implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String label;
	private float costJH;
	@ManyToOne
	@JoinColumn(name="CODE_ESTIMATION")
	private Estimation estimation;
 
		
	public UnitOfWork(String label, float costJH) {
		super();
		this.label = label;
		this.costJH = costJH;
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
	public float getCostJH() {
		return costJH;
	}
	public void setCostJH(float costJH) {
		this.costJH = costJH;
	}
	public Estimation getEstimation() {
		return estimation;
	}
	public void setEstimation(Estimation estimation) {
		this.estimation = estimation;
	}

	
}
