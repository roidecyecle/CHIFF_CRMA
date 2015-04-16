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
@Table(name = "ESTIMATION")
public class Estimation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String label;
	private String status;
	@OneToMany(mappedBy="estimation",fetch=FetchType.LAZY)
	private Collection<UnitOfWork> unitsOfWork;
	private Subject subject;
	private Author author;

	public Estimation(int id, String label) {
		this.id = id;
		this.label = label;
	}

	public Estimation() {
		super();
	}

	public Estimation(String label) {
		super();
		this.label = label;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getlabel() {
		return label;
	}

	public void setLibelle(String label) {
		this.label = label;
	}

	public Collection<UnitOfWork> getUnitsOfWork() {
		return unitsOfWork;
	}

	public void setUnitsOfWork(Collection<UnitOfWork> unitsOfWork) {
		this.unitsOfWork = unitsOfWork;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
