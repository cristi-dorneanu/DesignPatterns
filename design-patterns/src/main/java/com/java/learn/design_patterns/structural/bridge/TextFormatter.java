package com.java.learn.design_patterns.structural.bridge;

import java.util.List;

public class TextFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(header).append("\n");
		
		for(Detail detail : details) {
			sb.append(detail.getKey()).append(":").append(detail.getValue()).append("\n");
		}
		
		return sb.toString();
	}

}
