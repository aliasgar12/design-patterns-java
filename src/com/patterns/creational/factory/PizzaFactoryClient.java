package com.patterns.creational.factory;

public class PizzaFactoryClient {

	public static void main(String[] args) {

		PizzaStore pizzaHut = new PizzaHut();
		PizzaStore dominos = new Dominos();
		
		// Ordering cheese pizza from both the stores
		Pizza pizza = pizzaHut.orderPizza(PizzaType.CHEESE);
		System.out.println(pizza);
		System.out.println("Ali ordered a " + pizza.getName() + "\n\n");
		
		pizza = dominos.orderPizza(PizzaType.CHEESE);
		System.out.println(pizza);
		System.out.println("Himank ordered a " + pizza.getName() + "\n\n");

		
		// Ordering chicken pizza from both the stores	
		
		pizza = pizzaHut.orderPizza(PizzaType.CHICKEN);
		System.out.println(pizza);
		System.out.println("Ali ordered a " + pizza.getName() + "\n\n");

		pizza = dominos.orderPizza(PizzaType.CHICKEN);
		System.out.println(pizza);
		System.out.println("Himank ordered a " + pizza.getName() + "\n\n");

		
		// Ordering pepperoni pizza from both the stores

		pizza = pizzaHut.orderPizza(PizzaType.PEPPERONI);
		System.out.println(pizza);
		System.out.println("Ali ordered a " + pizza.getName() + "\n\n");

		pizza = dominos.orderPizza(PizzaType.PEPPERONI);
		System.out.println(pizza);
		System.out.println("Himank ordered a " + pizza.getName() + "\n\n");

		
	}

}
