package demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepo extends JpaRepository<Order, Integer>{
	
	@Query("select order from Order order where order.email=?1 order by order_id DESC")
	public List<Order> findbyEmail(String s);	
}
