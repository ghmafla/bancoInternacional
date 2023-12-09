package com.btln.online.login.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btln.online.login.services.model.BankingMovement;

@Repository
public interface BankingMovementRepository extends JpaRepository<BankingMovement, Long>{

	
}
