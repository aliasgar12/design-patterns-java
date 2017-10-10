package com.patterns.creational.builder;

public class CPU {

	public static class CPUAssembler {

		private int hdd;
		private int ram;
		private boolean graphicsCard;
		private boolean touchScreen;
		private String processor;

		public CPUAssembler() {
		}

		public CPUAssembler addGraphicsCard( boolean graphics){
			this.graphicsCard = graphics;
			return this;
		}
		
		public CPUAssembler addHDD( int storageSize){
			this.hdd = storageSize;
			return this;
		}
		public CPUAssembler addProcessor( String processor){
			this.processor = processor;
			return this;
		}
		public CPUAssembler addRAM( int ramSize){
			this.ram = ramSize;
			return this;
		}
		public CPUAssembler addTouchScreen( boolean touch){
			this.touchScreen = touch;
			return this;
		}
		
		// method to clean the builder object and set its values to default
		public void clean(){
			this.hdd = 0;
			this.ram = 0;
			this.graphicsCard = false;
			this.touchScreen = false;
			this.processor = null;
		}
		
		public CPU build() {
			return new CPU(this);
		}

	}

	private final int hdd;
	private final int ram;
	private final boolean graphicsCard;
	private final boolean touchScreen;
	private final String processor;

	public CPU(CPUAssembler computerBuilder) {
			this.hdd = computerBuilder.hdd;
			this.ram = computerBuilder.ram;
			this.graphicsCard = computerBuilder.graphicsCard;
			this.touchScreen = computerBuilder.touchScreen;
			this.processor = computerBuilder.processor;		
	}

	public int getHdd() {
		return hdd;
	}

	public String getProcessor() {
		return processor;
	}

	public int getRam() {
		return ram;
	}

	public boolean hasGraphicsCard() {
		return graphicsCard;
	}

	public boolean isTouchScreen() {
		return touchScreen;
	}
	
	
	public String toString(){
		return "The configuration of this computer are as follows \n"
				+ "Processor : " + getProcessor() + " \n"
						+ "RAM storage : " + getRam() + " GB \n"
			 					+ "Hard disk storage : " + getHdd() + "GB \n"
										+ "Touch Screen : " + isTouchScreen() + "\n"
												+ "Graphics Card : " + hasGraphicsCard() + "\n";
	}

}
