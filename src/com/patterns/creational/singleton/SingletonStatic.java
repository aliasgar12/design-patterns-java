package com.patterns.creational.singleton;

public class SingletonStatic {
	
	private static SingletonStatic instance = new SingletonStatic();
	private String name;
	
	private SingletonStatic(){
	}
	
	public static SingletonStatic getInstance(){
		return instance;
	}
	
	public String getDescription(){
		return "I am a statically initialized singleton - " + getName() ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
