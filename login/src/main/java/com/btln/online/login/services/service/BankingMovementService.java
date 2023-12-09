package com.btln.online.login.services.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btln.online.login.services.model.BankingMovement;
import com.btln.online.login.services.repository.BankingMovementRepository;

@Service("bankingMovementService")
public class BankingMovementService {
	/**
	 * @Autowired: inyecta una instancia de un clase que implemeta la interface JpaRepository
	 */
	@Autowired
	private BankingMovementRepository bankingMovementRepository;
	
	public List<BankingMovement> listAll(){
		return bankingMovementRepository.findAll();
	}
	
	public BankingMovement findById(long id) {
		Optional<BankingMovement> retorno = bankingMovementRepository.findById(id);
		return retorno.isPresent()? retorno.get() : null; 
	}
	
	public BankingMovement add(BankingMovement bankingMovement) {
        return  bankingMovementRepository.save(bankingMovement);
	}
	
	public BankingMovement update(BankingMovement bankingMovement) {
		BankingMovement bankingMovementEdit = bankingMovementRepository.findById(bankingMovement.getId()).get();
		bankingMovementEdit.setCodeMovement(bankingMovement.getCodeMovement());
		bankingMovementEdit.setTypeMovement(bankingMovement.getTypeMovement());
		bankingMovementEdit.setWorth(bankingMovement.getWorth());
		bankingMovementEdit.setDescription(bankingMovement.getDescription());
		
		return bankingMovementRepository.save(bankingMovementEdit);
	}
	
	public void delete(BankingMovement bankingMovement) {
		bankingMovementRepository.delete(bankingMovement);
	}
}
