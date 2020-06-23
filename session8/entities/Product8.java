package entities;

public class Product8 {
	public String name;
	public double price;
	public int quantity;

	//
	public double totalValueInStock() {
		return price * quantity;
	}

	//
	public void addProducts(int quantity) {
		this.quantity += quantity;
		System.out.println("Produto Adicionado");
	}

	//
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		System.out.println("Produto Removido");
	}

	public String toString() {
		return "Product: " + name + " $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f",totalValueInStock());
	}
}
