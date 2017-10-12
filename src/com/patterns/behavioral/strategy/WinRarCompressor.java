package com.patterns.behavioral.strategy;

public class WinRarCompressor extends Compressor {

	public WinRarCompressor() {
		this.compressionStrategy = new LzmaCompression();
	}

	@Override
	void display() {
		System.out.println("I am Winrar compressor using " + compressionStrategy.getName() + " strategy");
	}

}
