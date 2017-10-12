package com.patterns.behavioral.strategy;

public class GzipCompression implements CompressionStrategy {
	
	public void compress() {
		System.out.println("You are using Gzip compression for this file");
	}

	@Override
	public String getName() {
		return "Gzip";
		
	}	
}
