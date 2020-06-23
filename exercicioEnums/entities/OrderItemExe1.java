package entities;

public class OrderItemExe1 {
	private Integer quantity;
	private Double price;
	
	private ProductExe1 product;

	public OrderItemExe1(Integer quantity, Double price, ProductExe1 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductExe1 getProduct() {
		return product;
	}

	public void setProduct(ProductExe1 product) {
		this.product = product;
	}

	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
