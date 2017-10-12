package com.patterns.behavioral.strategy;

public class CompressionStrategyTest {

	public static void main(String[] args) {

		// Default compressor
		WinRarCompressor winRarCompressor = new WinRarCompressor();
		Zip7Compressor zip7Compressor = new Zip7Compressor();
		WinzipCompressor winzipCompressor = new WinzipCompressor();
		
		winRarCompressor.display();
		winRarCompressor.performCompression();
		
		System.out.println();
		
		zip7Compressor.display();
		zip7Compressor.performCompression();
		
		System.out.println();

		winzipCompressor.display();
		winzipCompressor.performCompression();
		
		
		
		// interchanging algorithms at runtime
		System.out.println("\nInterchanging algorithms at runtime \n");

		winRarCompressor.setCompressionStrategy(new LzipCompression());
		zip7Compressor.setCompressionStrategy(new BzipCompression());
		winzipCompressor.setCompressionStrategy(new LzmaCompression());
		
		winRarCompressor.display();
		winRarCompressor.performCompression();
		
		System.out.println();
		
		zip7Compressor.display();
		zip7Compressor.performCompression();
		
		System.out.println();

		winzipCompressor.display();
		winzipCompressor.performCompression();
		
	}

}
