package com.crbProject.crbProject.Service;

import java.util.List;
import java.util.Optional;

import com.crbProject.crbProject.Domain.Sector;

public interface SectorService {

	public Sector createSector(Sector province);
	public void updateSector(Sector province);
	public void deleteSector(int id);
	public Optional<Sector> findByid(int id);
	public List<Sector> findAll(Class c);
}
