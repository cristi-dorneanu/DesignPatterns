package com.java.learn.design_patterns.structural.bridge;

import java.util.List;

public abstract class Printer {
	
	public String write(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}
	
	protected abstract String getHeader();
	
	protected abstract List<Detail> getDetails();
}
