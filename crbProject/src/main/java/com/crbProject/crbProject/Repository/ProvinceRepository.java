package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.Gender;
import com.crbProject.crbProject.Domain.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {

	public Optional<Province> findByid(int id);
	
}
