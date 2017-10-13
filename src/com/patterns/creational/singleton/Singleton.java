package com.patterns.creational.singleton;

public class Singleton {
	
	private static Singleton instance;
	private String name;
	
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public String getDescription(){
		return "I am a classic singleton - " + getName() ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
