package com.btln.online.login.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btln.online.login.services.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

	
}
