package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.Province;
import com.crbProject.crbProject.Domain.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Integer> {

	public Optional<Sector> findByid(int id);
}
