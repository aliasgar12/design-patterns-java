package com.patterns.behavioral.strategy;

public class Zip7Compressor extends Compressor{
	
	public Zip7Compressor(){
		this.compressionStrategy = new LzipCompression();
	}

	
	@Override
	void display() {
		System.out.println("I am 7zip compressor using " + compressionStrategy.getName() + " strategy");
	}
}
