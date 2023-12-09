package com.btln.online.login.services.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btln.online.login.services.model.Users;
import com.btln.online.login.services.repository.UsersRepository;

@Service("usersService")
public class UsersService {
	/**
	 * @Autowired: inyecta una instancia de un clase que implemeta la interface JpaRepository
	 */
	@Autowired
	private UsersRepository usersRepository;
	
	public List<Users> listAll(){
		return usersRepository.findAll();
	}
	
	public Users findById(long id) {
		Optional<Users> retorno = usersRepository.findById(id);
		return retorno.isPresent()? retorno.get() : null; 
	}
	
	public Users add(Users user) {
        return  usersRepository.save(user);
	}
	
	public Users update(Users user) {
		Users userEdit = usersRepository.findById(user.getId()).get();
		userEdit.setLastname(user.getLastname());
		userEdit.setMail(user.getMail());
		userEdit.setName(user.getName());
		userEdit.setUsername(user.getUsername());
		
		return usersRepository.save(userEdit);
	}
	
	public void delete(Users user) {
        usersRepository.delete(user);
	}
}
