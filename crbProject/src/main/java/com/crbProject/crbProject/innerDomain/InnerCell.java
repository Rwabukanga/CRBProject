package com.crbProject.crbProject.innerDomain;

import javax.persistence.ManyToOne;

import com.crbProject.crbProject.Domain.Sector;

public class InnerCell {
	
    private String name;
	
	
	private int sectorid;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSectorid() {
		return sectorid;
	}


	public void setSectorid(int sectorid) {
		this.sectorid = sectorid;
	}   

	
	
}
