package demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class OrderDAO {
	@Autowired
	OrderRepo repo;
	
	public Order insert(Order o) {
		repo.save(o);
		return o;
	}
	
	public List<Order> get(String s) {
	List<Order> o = repo.findbyEmail(s);
		return o;
	}
	
	

}
