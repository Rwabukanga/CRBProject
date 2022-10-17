package com.crbProject.crbProject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crbProject.crbProject.Domain.Country;

@Service
public interface CountryService {

	public Country createCountry(Country country);
	public void updateCountry(Country country);
	public void deleteCountry(int id);
	public Optional<Country> findByid(int id);
	public List<Country> findAll(Class c);
}
