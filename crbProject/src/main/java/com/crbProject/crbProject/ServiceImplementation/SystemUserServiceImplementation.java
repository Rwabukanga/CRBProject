package com.crbProject.crbProject.ServiceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crbProject.crbProject.Domain.SystemUser;
import com.crbProject.crbProject.Repository.SystemUserRepository;
import com.crbProject.crbProject.Service.SystemUserService;

@Service
public class SystemUserServiceImplementation implements SystemUserService {

	@Autowired
	private SystemUserRepository userrepo;
	
	@Override
	public void createUser(SystemUser user) {
		// TODO Auto-generated method stub
		userrepo.save(user);
	}

	@Override
	public Optional<SystemUser> findByUsername(String username) {
		// TODO Auto-generated method stub
		return userrepo.findByUsername(username);
	}

	

}
