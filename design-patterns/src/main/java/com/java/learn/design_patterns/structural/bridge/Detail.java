package com.java.learn.design_patterns.structural.bridge;

public class Detail {
	private String key;
	private String value;
	
	public Detail() {
		this("", "");
	}
	
	public Detail(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
