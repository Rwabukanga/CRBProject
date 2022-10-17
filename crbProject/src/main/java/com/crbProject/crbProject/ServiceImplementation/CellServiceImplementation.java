package com.crbProject.crbProject.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crbProject.crbProject.Domain.Cell;
import com.crbProject.crbProject.Repository.CellRepository;
import com.crbProject.crbProject.Service.CellService;

@Service
public class CellServiceImplementation implements CellService {

	@Autowired
	private CellRepository cellrepo;

	@Override
	public Cell createCell(Cell cell) {
		// TODO Auto-generated method stub
		return cellrepo.save(cell);
	}

	@Override
	public void updateCell(Cell cell) {

		cellrepo.save(cell);
		
	}

	@Override
	public void deleteCell(int id) {
		// TODO Auto-generated method stub
		cellrepo.deleteById(id);
	}

	@Override
	public Optional<Cell> findByid(int id) {
		// TODO Auto-generated method stub
		return cellrepo.findByid(id);
	}

	@Override
	public List<Cell> findAll(Class c) {
		// TODO Auto-generated method stub
		return cellrepo.findAll();
	}
}
