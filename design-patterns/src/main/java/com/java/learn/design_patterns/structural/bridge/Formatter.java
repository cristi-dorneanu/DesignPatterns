package com.java.learn.design_patterns.structural.bridge;

import java.util.List;


public interface Formatter {
	public String format(String header, List<Detail> details);
}
