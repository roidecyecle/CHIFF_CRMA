package com.linedata.ekip.pos.dao.model.impl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UNIT_OF_WORK")
public class UnitOfWork implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String label;
	private float costJH;
	private float costH;
	@OneToOne
	@JoinColumn(name="ACTION_TYPE")
	private ActionType actionType;
	@ManyToOne
	@JoinColumn(name="CODE_ESTIMATION")
	private Estimation estimation;
//	@ManyToOne
//	@JoinColumn(name="CODE_ABACUS")
//	private Abacus abacus;
// 
		
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

	public float getCostH() {
		return costH;
	}

	public void setCostH(float costH) {
		this.costH = costH;
	}

//	public Abacus getAbacus() {
//		return abacus;
//	}
//
//	public void setAbacus(Abacus abacus) {
//		this.abacus = abacus;
//	}

	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	
}
