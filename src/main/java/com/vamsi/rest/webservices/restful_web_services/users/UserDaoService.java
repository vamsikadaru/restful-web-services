package com.vamsi.rest.webservices.restful_web_services.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA/Hibernate > DB
	// UserDaoService > Static List
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Vamsi", LocalDate.now().minusYears(10)));
		users.add(new User(2, "Bindu", LocalDate.now().minusYears(12)));
		users.add(new User(3, "Lavanya", LocalDate.now().minusYears(14)));
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
}
