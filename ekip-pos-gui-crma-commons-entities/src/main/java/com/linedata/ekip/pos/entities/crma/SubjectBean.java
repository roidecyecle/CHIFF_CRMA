package com.linedata.ekip.pos.entities.crma;

import java.io.Serializable;
import java.util.Date;

import com.linedata.ekip.pos.dao.model.impl.Product;


public class SubjectBean implements Serializable {


	private long id;
	private String description;
	private String version_study;
	private Date date_study;
	private String version;
	private Product produit;	

	
	
	public SubjectBean(String description, String version_study, Date date_study,String version) {
		super();
		this.description = description;
		this.version_study = version_study;
		this.date_study = date_study;
		this.version = version;
	}

	public SubjectBean() {
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

	


}
