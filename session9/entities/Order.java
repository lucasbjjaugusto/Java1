package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product9 product;

	public Order(Date date, Product9 product) {
		super();
		this.date = date;
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product9 getProduct() {
		return product;
	}

	public void setProduct(Product9 product) {
		this.product = product;
	}

}
