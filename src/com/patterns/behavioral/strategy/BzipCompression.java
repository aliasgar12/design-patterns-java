package com.patterns.behavioral.strategy;

public class BzipCompression implements CompressionStrategy {
	
	public void compress() {
		System.out.println("You are using Bzip compression for this file");
	}

	@Override
	public String getName() {
		return "Bzip";
	}
}

