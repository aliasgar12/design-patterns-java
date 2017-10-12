package com.patterns.behavioral.strategy;

public abstract class Compressor {

	CompressionStrategy compressionStrategy;
	
	public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
		this.compressionStrategy = compressionStrategy;
	}
	
	public void performCompression(){
		compressionStrategy.compress();
	}

	abstract void display();
}
