package com.patterns.creational.factory;

public class DominosPepperoniPizza extends Pizza{

	public DominosPepperoniPizza(){
		name = "Dominos Pepperoni Pizza";
		toppings.add("Pepperoni");
		toppings.add("Mushrooms");
		toppings.add("Dominos special green peppers");
	}
	
	@Override
	public void bake(){
		System.out.println("Baking with dominos thin crust");
	}
}
