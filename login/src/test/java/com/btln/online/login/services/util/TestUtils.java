package com.btln.online.login.services.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.btln.online.login.services.model.Users;

public class TestUtils {
	
	public static List<Users> getListUserTest(){
		List<Users> listUser = new ArrayList<>();
		listUser.add(new Users("Carlos","puerquin","rccs@gmail.com",""));
		listUser.add(new Users("Rodrigo","654321","asd@gmail.com",""));
		listUser.add(new Users("Gabriel","212121","qwe@gmail.com",""));
		return listUser;
	}
	
	public static Optional<Users> getAnyOptionalUser() {
		Optional<Users> user = Optional.of(getListUserTest().get(0));
		return user;
	}
	
	public static Users getAnyUser() {
		return getListUserTest().get(0);
	}
	
	
}
