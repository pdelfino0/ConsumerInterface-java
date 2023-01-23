package entities;

public class Product {

	private String name;
	private Double price;

	public Product(String namme, Double price) {
		this.name = namme;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	public String getNamme() {
		return name;
	}

	public void setName(String namme) {
		this.name = namme;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
