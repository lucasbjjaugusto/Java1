package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatusExe1;

public class OrderExe1 {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatusExe1 status;
	private ClientExe1 client;
	private List<OrderItemExe1> itens = new ArrayList<>();

	public OrderExe1() {
	}

	public OrderExe1(Date moment, OrderStatusExe1 status, ClientExe1 client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatusExe1 getStatus() {
		return status;
	}

	public void setStatus(OrderStatusExe1 status) {
		this.status = status;
	}

	public ClientExe1 getClient() {
		return client;
	}

	public void setClient(ClientExe1 client) {
		this.client = client;
	}

	public List<OrderItemExe1> getItems() {
		return itens;
	}

	public void addItem(OrderItemExe1 item) {
		itens.add(item);
	}

	public void removeItem(OrderItemExe1 item) {
		itens.remove(item);
	}

	public Double total() {
		double total = 0.0;
		for (OrderItemExe1 i : itens) {
			total = total + i.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItemExe1 item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
