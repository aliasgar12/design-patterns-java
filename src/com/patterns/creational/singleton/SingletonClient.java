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
		
		
		// Thread safe singleton
		SingletonThreadSafe singleton1 = SingletonThreadSafe.getInstance();
		singleton1.setName("Singleton 1");
		System.out.println(singleton1.getDescription());
		
		// Another thread safe singleton
		SingletonThreadSafe singleton2 = SingletonThreadSafe.getInstance();
		System.out.println(singleton2.getDescription());
		
		// Thread safe singleton
		SingletonStatic singletonStaticA= SingletonStatic.getInstance();
		singletonStaticA.setName("Static Singleton A");
		System.out.println(singletonStaticA.getDescription());

		// Another thread safe singleton
		SingletonStatic singletonStaticB = SingletonStatic.getInstance();
		System.out.println(singletonStaticB.getDescription());
		
		// Changing values for singleton B and getting description for Singleton A
		singletonStaticB.setName("Singleton B");
		System.out.println(singletonStaticA.getDescription());

		
	}

}
