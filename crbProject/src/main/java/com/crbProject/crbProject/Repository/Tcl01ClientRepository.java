package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.Sector;
import com.crbProject.crbProject.Domain.Tcl01Client;

@Repository
public interface Tcl01ClientRepository extends JpaRepository<Tcl01Client, Integer> {

	public Optional<Tcl01Client> findByid(int id);
}
