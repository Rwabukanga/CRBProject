package com.crbProject.crbProject.innerDomain;

import javax.persistence.ManyToOne;

import com.crbProject.crbProject.Domain.District;

public class InnerSector {
	
    private String name;
	
	
	private int districtid;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDistrictid() {
		return districtid;
	}


	public void setDistrictid(int districtid) {
		this.districtid = districtid;
	}
	
	
	

}
