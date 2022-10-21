package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.SystemUser;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Integer> {

	Optional<SystemUser> findById(int id);
	Optional<SystemUser> findByUsername(String username);
}
