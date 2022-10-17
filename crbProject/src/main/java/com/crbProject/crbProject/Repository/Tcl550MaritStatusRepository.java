package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.Tcl01Client;
import com.crbProject.crbProject.Domain.Tcl550MaritStatus;

@Repository
public interface Tcl550MaritStatusRepository extends JpaRepository<Tcl550MaritStatus, Integer> {

	public Optional<Tcl550MaritStatus> findByid(int id);
}
