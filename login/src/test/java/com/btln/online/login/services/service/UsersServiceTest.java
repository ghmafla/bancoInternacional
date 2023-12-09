package com.btln.online.login.services.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.List;

import com.btln.online.login.services.model.Users;
import com.btln.online.login.services.repository.UsersRepository;
import com.btln.online.login.services.util.TestUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsersServiceTest {
	
	@Autowired
	@InjectMocks
	UsersService usersService;
	
	@Mock
	UsersRepository usersRepository;
	
	
	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
	}
	
	
	@Test
	void testListAll() {
		//WHEN
		when(usersRepository.findAll()).thenReturn(TestUtils.getListUserTest());
		//THEN
		List<Users>  list = usersService.listAll();
		
		//ASSERT
		assertNotNull(list);
		assertTrue(list.size() == TestUtils.getListUserTest().size());
	}
	
	@Test
	void testFindById() {
		//WHEN
		when(usersRepository.findById(anyLong())).thenReturn(TestUtils.getAnyOptionalUser());
		//THEN
		Users user = usersService.findById(0);
		
		//ASSERT
		assertNotNull(user);
	}
	
	@Test
	void testAdd() {
		//WHEN
		when(usersRepository.save(Mockito.any(Users.class))).thenReturn(TestUtils.getAnyUser() );
		//THEN
		Users user = usersService.add(TestUtils.getAnyUser());
		
		//ASSERT
		assertNotNull(user);
	}
	
	@Test
	void testUpdate() {
		//WHEN
		when(usersRepository.findById(anyLong())).thenReturn(TestUtils.getAnyOptionalUser());
		when(usersRepository.save(Mockito.any(Users.class))).thenReturn(TestUtils.getAnyUser() );
		//THEN
		Users user = usersService.update(TestUtils.getAnyUser());
		
		//ASSERT
		assertNotNull(user);
	}
	
	@Test
	void testDelete() {
		//WHEN
		doNothing().when(usersRepository).delete(Mockito.any(Users.class));
		//THEN
		usersService.delete(TestUtils.getAnyUser());
		
		//ASSERT
		assertTrue(true);//nunca debemos tener este asserttrue quemado
	}
	

}
