package com.patterns.creational.singleton;

public class SingletonClient {

	public static void main(String[] args) {
		
		
		// Intializing some classic singleton
		
		Singleton singletonA = Singleton.getInstance();
		singletonA.setName("Singleton A");
		System.out.println(singletonA.getDescription());
		
		// Another classic singleton
		Singleton singletonB = Singleton.getInstance();
		System.out.println(singletonB.getDescription());
	}

}
