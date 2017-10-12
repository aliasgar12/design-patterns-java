package com.patterns.behavioral.strategy;

public class WinzipCompressor extends Compressor {
	
	public WinzipCompressor(){
		this.compressionStrategy = new GzipCompression();
	}

	@Override
	void display() {
		System.out.println("I am Winzip compressor using " + compressionStrategy.getName() + " strategy");
	}
}
