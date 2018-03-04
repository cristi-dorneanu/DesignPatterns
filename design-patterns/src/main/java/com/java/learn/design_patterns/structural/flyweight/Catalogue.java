package com.java.learn.design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
	private Map<String, Item> cache = new HashMap<>();
	
	public Item lookup(String name) {
		Item item = cache.get(name);
		
		if(item == null) {
			item = new Item(name);
			cache.put(name, item);
		}
		
		return item;
	}
	
	public int numberOfItems() {
		return cache.size();
	}
}
