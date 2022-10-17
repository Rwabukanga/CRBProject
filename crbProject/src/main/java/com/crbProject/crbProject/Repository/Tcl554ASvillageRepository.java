package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.Tcl554ASvillage;

@Repository
public interface Tcl554ASvillageRepository extends JpaRepository<Tcl554ASvillage, Integer> {

	public Optional<Tcl554ASvillage> findByid(int id);
}
