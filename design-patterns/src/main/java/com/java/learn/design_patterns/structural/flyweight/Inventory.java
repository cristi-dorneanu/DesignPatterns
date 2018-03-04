package com.java.learn.design_patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	private List<Order> orders = new ArrayList<>();
	private Catalogue catalogue;
	
	public Inventory() {
		catalogue = new Catalogue();
	}
	
	public void takeOrder(String name, int id) {
		Item item = this.catalogue.lookup(name);
		Order order = new Order(id, item);
		orders.add(order);
	}
	
	public String getReport() {
		StringBuilder sb = new StringBuilder();
		
		for(Order order : this.orders) {
			sb.append(order).append("\n");
		}
		
		sb.append(catalogue.numberOfItems()).append(" items created");
		
		return sb.toString();
	}
}
