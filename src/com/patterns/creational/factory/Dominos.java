package com.patterns.creational.factory;

public class Dominos extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType pizzaType) {
		switch(pizzaType) {
			case CHEESE : {
				return new DominosCheesePizza();
			}
			case CHICKEN: {
				return new DominosChickenPizza();
			}
			case PEPPERONI: {
				return new DominosPepperoniPizza();
			}
			
		}
		return null;
	}

}
