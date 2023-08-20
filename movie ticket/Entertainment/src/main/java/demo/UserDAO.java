package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class UserDAO {

	@Autowired
	UserRepo repo;
	
	public User insert(User u) {
		repo.save(u);
		return u;
	}
	
	public List<User> getall(){
		List<User> u = repo.findAll();
		return u;
	}
}
