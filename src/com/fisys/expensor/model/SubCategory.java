package com.fisys.expensor.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SubCategory extends IdentityEntityBase{
	@ManyToOne
	private Category category;
	private String name;
	
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
