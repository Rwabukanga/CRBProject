package com.crbProject.crbProject.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crbProject.crbProject.Domain.Tcl554ASvillage;
import com.crbProject.crbProject.Repository.Tcl554ASvillageRepository;
import com.crbProject.crbProject.Service.Tcl554ASvillageService;

@Service
public class Tcl554ASvillageServiceImplementation implements Tcl554ASvillageService {
	
	@Autowired
	private Tcl554ASvillageRepository villagerepo;

	@Override
	public Tcl554ASvillage createTcl01Client(Tcl554ASvillage client) {
		// TODO Auto-generated method stub
		return villagerepo.save(client);
	}

	@Override
	public void updateTcl554ASvillage(Tcl554ASvillage client) {
		// TODO Auto-generated method stub
		villagerepo.save(client);
	}

	@Override
	public void deleteTcl554ASvillage(int id) {
		// TODO Auto-generated method stub
		villagerepo.deleteById(id);
	}

	@Override
	public Optional<Tcl554ASvillage> findByid(int id) {
		// TODO Auto-generated method stub
		return villagerepo.findByid(id);
	}

	@Override
	public List<Tcl554ASvillage> findAll(Class c) {
		// TODO Auto-generated method stub
		return villagerepo.findAll();
	}

}
