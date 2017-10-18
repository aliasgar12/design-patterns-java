package com.patterns.creational.factory;

public abstract class PizzaStore {
	
	abstract Pizza createPizza(PizzaType item);
	
	public Pizza orderPizza(PizzaType type){
		Pizza pizza = createPizza(type);
		System.out.println("Ordering a " + pizza.getName());
		pizza.cut();
		pizza.bake();
		pizza.box();
		return pizza;	
	}
}
