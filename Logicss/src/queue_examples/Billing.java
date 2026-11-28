package queue_examples;

import java.util.LinkedList;
import java.util.Queue;

class Order {
	int id;
	String name;

	public Order(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Order : {  id : " + id + ", name : " + name + "}";
	}
}

class Restaurant {
	Queue<Order> queue = new LinkedList<Order>();

	void placeOrder(Order order) throws InterruptedException {
		queue.add(order);
		System.out.println("The Order " + order.id + "is Recieved ");
		

	}

	void displayOrders() {
		System.out.println("Available Orders");
		for (Order order : queue) {
			System.out.println(order);

		}

	}

	void prepareOrder() throws InterruptedException {
		while (!queue.isEmpty()) {
			Order order = queue.peek();
			System.out.println("The Order " + order.id + "is Preparing ");
			int time = prePareTime(order.name);
			for (int i = time; i > 0; i--) {
				System.out.println("Your Order is Ready in " + i + "min");
				Thread.sleep(1000);
			}
			System.out.println("The Order " + order.id + "is Ready ");
			queue.poll();
			displayOrders();

		}
	}

	int prePareTime(String item) {
		switch (item) {
		case "pizza":
			return 5;
		case "burger":
			return 6;
		case "omlett":
			return 8;
		case "kebab":
			return 9;

		default:
			return 10;
		}
	}

}

public class Billing {
public static void main(String[] args) throws InterruptedException {
	Restaurant restaurant = new Restaurant();
	restaurant.placeOrder(new Order(101, "kebab"));
	restaurant.placeOrder(new Order(101, "pizza"));
	restaurant.placeOrder(new Order(101, "burger"));
	restaurant.placeOrder(new Order(101, "omlett"));
	restaurant.placeOrder(new Order(101, "desert"));
	restaurant.displayOrders();
	restaurant.prepareOrder();
	
}

}
