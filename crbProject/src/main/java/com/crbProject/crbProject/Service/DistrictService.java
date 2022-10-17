package com.crbProject.crbProject.Service;

import java.util.List;
import java.util.Optional;

import com.crbProject.crbProject.Domain.District;



public interface DistrictService {
	
	public District createDistrict(District district);
	public void updateDistrict(District district);
	public void deleteDistrict(int id);
	public Optional<District> findByid(int id);
	public List<District> findAll(Class c);

}
