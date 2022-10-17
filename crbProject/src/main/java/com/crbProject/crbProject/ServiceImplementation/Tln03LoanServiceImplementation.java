package com.crbProject.crbProject.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crbProject.crbProject.Domain.Tln03Loan;
import com.crbProject.crbProject.Repository.Tln03LoanRepository;
import com.crbProject.crbProject.Service.Tln03LoanService;

@Service
public class Tln03LoanServiceImplementation implements Tln03LoanService {
	
	@Autowired
	private Tln03LoanRepository loanrepo;

	@Override
	public Tln03Loan createTln03Loan(Tln03Loan client) {
		// TODO Auto-generated method stub
		return loanrepo.save(client);
	}

	@Override
	public void updateTln03Loan(Tln03Loan client) {
		// TODO Auto-generated method stub
		loanrepo.save(client);
	}

	@Override
	public void deleteTln03Loan(int id) {
		// TODO Auto-generated method stub
		loanrepo.deleteById(id);
	}

	@Override
	public Optional<Tln03Loan> findByid(int id) {
		// TODO Auto-generated method stub
		return loanrepo.findByid(id);
	}

	@Override
	public List<Tln03Loan> findAll(Class c) {
		// TODO Auto-generated method stub
		return loanrepo.findAll();
	}

}
