package com.crbProject.crbProject.Service;

import java.util.List;
import java.util.Optional;

import com.crbProject.crbProject.Domain.Tcl550MaritStatus;

public interface Tcl550MaritStatusService {
	
	public Tcl550MaritStatus createTcl01Client(Tcl550MaritStatus client);
	public void updateTcl550MaritStatus(Tcl550MaritStatus client);
	public void deleteTcl550MaritStatus(int id);
	public Optional<Tcl550MaritStatus> findByid(int id);
	public List<Tcl550MaritStatus> findAll(Class c);

}
