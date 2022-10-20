package com.crbProject.crbProject.Service;

import java.util.Optional;

import com.crbProject.crbProject.Domain.SystemUser;

public interface SystemUserService {

	public void createUser(SystemUser user);
	
	public Optional<SystemUser> findByUsername(String username);
}
