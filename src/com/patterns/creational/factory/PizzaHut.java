package com.patterns.creational.factory;

public class PizzaHut extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType pizzaType) {
		switch(pizzaType) {
			case CHEESE : {
				return new PizzaHutCheesePizza();
			}
			case CHICKEN: {
				return new PizzaHutChickenPizza();
			}
			case PEPPERONI: {
				return new PizzaHutPepperoniPizza();
			}
			
		}
		return null;
	}

}
