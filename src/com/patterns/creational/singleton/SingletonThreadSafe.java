package com.patterns.creational.singleton;

public class SingletonThreadSafe {
	
	private static SingletonThreadSafe instance;
	private String name;
	
	private SingletonThreadSafe(){
	}
	
	
// This method causes greater impact to the performance.
//	
//	public synchronized static SingletonThreadSafe getInstance(){
//		if(instance == null){
//			instance = new SingletonThreadSafe();
//		}
//		return instance;
//	}
	
	
	
	// Least impact on performance
	public static SingletonThreadSafe getInstance(){
		
		if(instance == null){
			synchronized(SingletonThreadSafe.class){
			if(instance == null)
				instance = new SingletonThreadSafe();
			}
		}
		return instance;
	}
	
	
	public String getDescription(){
		return "I am a thread safe singleton - " + getName() ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
