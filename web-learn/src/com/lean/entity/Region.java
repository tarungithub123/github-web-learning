package com.lean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TM_REGION")
public class Region {
	
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")@Column(name="Id")
	private int id; 
	
	@Column(name="region_code")
	private String regioncode; 
	
	@Column(name="region_desc")
	private String regiondesc;
	
	public Region(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegioncode() {
		return regioncode;
	}

	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}

	public String getRegiondesc() {
		return regiondesc;
	}

	public void setRegiondesc(String regiondesc) {
		this.regiondesc = regiondesc;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", regioncode=" + regioncode + ", regiondesc=" + regiondesc + "]";
	}
	
	
}
