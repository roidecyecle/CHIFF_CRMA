package com.linedata.ekip.pos.dao.model.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ESTIMATION")
public class Estimation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="E_DATE")
	private Date date;
	private String label;
	private String status;
	@OneToMany(mappedBy="estimation",fetch=FetchType.LAZY)
	private Collection<UnitOfWork> unitsOfWork;
	@ManyToOne
	@JoinColumn(name="ID_SUBJECT")
	private Subject subject;
	@ManyToOne
	@JoinColumn(name="ID_AUTOR")
	private Author author;

	

	public Estimation(Date date, String label, String status) {
		super();
		this.date = date;
		this.label = label;
		this.status = status;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
