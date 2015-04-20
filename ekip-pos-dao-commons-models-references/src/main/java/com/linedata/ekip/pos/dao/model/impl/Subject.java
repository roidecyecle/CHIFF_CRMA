package com.linedata.ekip.pos.dao.model.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
@Table(name = "SUBJECT")
public class Subject implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String description;
	private String version_study;
	@Temporal(TemporalType.DATE)
	private Date date_study;
	private String version;
	@ManyToOne
	@JoinColumn(name="ID_PRODUCT")
	private Product produit;
	@OneToMany(mappedBy="subject",fetch=FetchType.LAZY)
	private Collection<Estimation> estimation;

	public Subject(String description, String version_study, Date date_study,String version) {
		super();
		this.description = description;
		this.version_study = version_study;
		this.date_study = date_study;
		this.version = version;
	}

	public Subject() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion_etude() {
		return version_study;
	}

	public void setVersion_etude(String version_etude) {
		this.version_study = version_etude;
	}

	public Date getDate_etude() {
		return date_study;
	}

	public void setDate_etude(Date date_etude) {
		this.date_study = date_etude;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Product getProduit() {
		return produit;
	}

	public void setProduit(Product produit) {
		this.produit = produit;
	}

	public Collection<Estimation> getEstimation() {
		return estimation;
	}

	public void setEstimation(Collection<Estimation> estimation) {
		this.estimation = estimation;
	}


}
