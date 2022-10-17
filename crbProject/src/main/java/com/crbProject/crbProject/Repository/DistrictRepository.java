package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.Country;
import com.crbProject.crbProject.Domain.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

	public Optional<District> findByid(int id);
}
