package com.btln.online.login.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btln.online.login.services.model.BankingMovement;
import com.btln.online.login.services.service.BankingMovementService;

@RestController
@RequestMapping("/api/movement")

public class BankingMovementController {

	@Autowired
	BankingMovementService bankingMovementService;

	@PostMapping(path = "/findAllBankingMovement")
	public ResponseEntity<List<BankingMovement>> getfindAllBankingMovement() {
		try {
			List<BankingMovement> u = bankingMovementService.listAll();
			return new ResponseEntity<>(u, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(value = "/addBankingMovement")
	public ResponseEntity<String> crearUsusario(@RequestBody BankingMovement bankingMovement) {
		try {
			bankingMovementService.add(new BankingMovement(bankingMovement.getId(), bankingMovement.getCodeMovement() , bankingMovement.getTypeMovement(), bankingMovement.getWorth(), bankingMovement.getDescription()));
			return new ResponseEntity<>("OK", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("FAIL", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(path = "/findById", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BankingMovement> getBankingMovement(@RequestBody long id) {
		try {
			BankingMovement u = bankingMovementService.findById(id);
			return new ResponseEntity<>(u, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(value = "/update")
	public ResponseEntity<BankingMovement> getUserUpdate(@RequestBody BankingMovement bankingMovement) {
		try {
			BankingMovement u = bankingMovementService.update(bankingMovement);
			return new ResponseEntity<>(u, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(value = "/delete")
	public ResponseEntity<String> getUserDelete(@RequestBody BankingMovement bankingMovement) {
		try {
			bankingMovementService.delete(bankingMovement);
			return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al eliminar", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
