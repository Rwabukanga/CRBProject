package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.District;
import com.crbProject.crbProject.Domain.Gender;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer> {

	public Optional<Gender> findByid(int id);
}
