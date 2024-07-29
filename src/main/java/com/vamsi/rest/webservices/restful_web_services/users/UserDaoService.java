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
	
	private static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount, "Vamsi", LocalDate.now().minusYears(10)));
		users.add(new User(++usersCount, "Bindu", LocalDate.now().minusYears(12)));
		users.add(new User(++usersCount, "Lavanya", LocalDate.now().minusYears(14)));
	}
		
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
