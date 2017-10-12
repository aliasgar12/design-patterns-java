package com.patterns.behavioral.strategy;

public class LzipCompression implements CompressionStrategy {

	public void compress() {
		System.out.println("You are using Lzip compression for this file");
	}

	@Override
	public String getName() {
		return "Lzip";
	}

}
