package com.crbProject.crbProject.Service;

import java.util.List;
import java.util.Optional;

import com.crbProject.crbProject.Domain.Tcl01Client;

public interface Tcl01ClientService {
	
	public Tcl01Client createTcl01Client(Tcl01Client client);
	public void updateTcl01Client(Tcl01Client client);
	public void deleteTcl01Client(int id);
	public Optional<Tcl01Client> findByid(int id);
	public List<Tcl01Client> findAll(Class c);

}
