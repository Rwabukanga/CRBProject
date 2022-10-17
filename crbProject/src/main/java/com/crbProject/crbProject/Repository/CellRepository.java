package com.crbProject.crbProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crbProject.crbProject.Domain.Cell;
import com.crbProject.crbProject.Domain.Tln03Loan;

@Repository
public interface CellRepository extends JpaRepository<Cell, Integer> {

	public Optional<Cell> findByid(int id);
}
