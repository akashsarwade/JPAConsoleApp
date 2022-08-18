package com.jpa.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MobileDescription")
public class OneOPlus {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "companyName")
	private String companyName;	
	
	@Column(name = "brandName")
	private String brandName;	
	
	@Column(name = "modelName")
	private String modelName;
	
	@Column(name = "brandPrice")
	private float brandPrice;	

	
	public OneOPlus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OneOPlus(int id, String companyName, String brandName, float price, String modelName, float brandPrice) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.brandName = brandName;
		this.modelName = modelName;
		this.brandPrice = brandPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public float getBrandPrice() {
		return brandPrice;
	}
	public void setBrandPrice(float brandPrice) {
		this.brandPrice = brandPrice;
	}
	@Override
	public String toString() {
		return "OneOPlus [id=" + id + ", companyName=" + companyName + ", brandName=" + brandName 
				+ ", modelName=" + modelName + ", brandPrice=" + brandPrice + "]";
	}

	
	
}
