package com.patterns.creational.factory;

public class DominosCheesePizza extends Pizza {
	
	public DominosCheesePizza() { 
		name = "Dominos Cheese Pizza"; 
		toppings.add("Grated Reggiano Cheese");
	}
	
	@Override
	public void bake(){
		System.out.println("Baking with dominos thick crust");
	}
}
