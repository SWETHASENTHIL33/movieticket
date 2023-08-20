package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	private String email;
	private String firstname;
	private String lastname;
	private String mob;
	private String date;
	private int tkts;
	private String movie;
	private int price;
	

}
