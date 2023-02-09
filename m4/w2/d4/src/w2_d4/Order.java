package w2_d4;

import java.sql.Date;
import java.util.List;

public class Order {
	private long id;
	private String status;
	private Date orderDate;
	private Date deliveryDate;
	private List<Product> products;
	private Customer customer;

	public Order(Long id, String status, Date orderDate, Date deliveryDate, List<Product> products,
			Customer customer) {
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.customer = customer;
	}
	
	
}
