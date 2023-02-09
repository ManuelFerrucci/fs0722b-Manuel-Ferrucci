package w2_d4;

public class Product {

	private long id;
	private String name;
	private String category;
	private double price;

	public Product(Long id, String name, String category, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}