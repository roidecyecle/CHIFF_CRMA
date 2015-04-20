package com.linedata.ekip.pos.dao.model.impl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="PRODUCT")
public class Product implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	private String label;
	
	
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
	
}
