package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.Cell;
import com.crbProject.crbProject.Domain.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

	public Optional<Country> findByid(int id);
}
