package com.linedata.ekip.pos.dao.model.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AUTHOR")
public class Author implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String function;
	@OneToMany(mappedBy="author",fetch=FetchType.LAZY)
	private Collection<Estimation> estimation;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public Collection<Estimation> getEstimation() {
		return estimation;
	}
	public void setEstimation(Collection<Estimation> estimation) {
		this.estimation = estimation;
	}

}
