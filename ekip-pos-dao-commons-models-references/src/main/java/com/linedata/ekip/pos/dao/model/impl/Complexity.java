package com.linedata.ekip.pos.dao.model.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="COMPONENT")
public class Complexity implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String label;
	@ManyToMany
	@JoinTable(name="ABAQUES")
	private Collection<Component> components;
	
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
	public Collection<Component> getComponents() {
		return components;
	}
	public void setComponents(Collection<Component> components) {
		this.components = components;
	}
	
}
