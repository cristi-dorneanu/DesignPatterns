package com.java.learn.design_patterns.structural.flyweight;

public class App {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		
		inventory.takeOrder("Car", 111);
		inventory.takeOrder("House", 123);
		inventory.takeOrder("Car", 124);
		inventory.takeOrder("Socks", 125);
		inventory.takeOrder("House", 23);
		inventory.takeOrder("House", 242);
		inventory.takeOrder("Socks", 24142);
		inventory.takeOrder("House", 3523);
		inventory.takeOrder("Socks", 34);
		inventory.takeOrder("House", 342);
		
		
		System.out.println(inventory.getReport());
	}
}
