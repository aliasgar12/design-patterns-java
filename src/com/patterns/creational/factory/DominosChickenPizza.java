package com.patterns.creational.factory;

public class DominosChickenPizza extends Pizza {

	public DominosChickenPizza(){
		name = "Dominos Chicken Pizza";
		toppings.add("Shredded Chicken");
		toppings.add("Sausage and Bacon");
		toppings.add("Onions");
		
	}
	
	@Override
	public void bake(){
		System.out.println("Baking with dominos thick cheesy crust");
	}
}
