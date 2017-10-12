package com.patterns.behavioral.strategy;

public class LzmaCompression implements CompressionStrategy {

	public void compress() {
		System.out.println("You are using Lzma compression for this file");
	}

	@Override
	public String getName() {
		return "Lzma";
	}

}

