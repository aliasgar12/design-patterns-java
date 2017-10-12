package com.patterns.creational.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		
		//basic sandwich and burger
		FoodItem sandwich = new Sandwich();
		FoodItem burger = new Burger();
		
		System.out.println(sandwich.getDescription());
		System.out.println(sandwich.cost());
		
		System.out.println(burger.getDescription());
		System.out.println(burger.cost());
		
		//custom sandwich and burger
		
		// sandwich with turkey and chicken
		sandwich = new Sandwich();
		sandwich = new TurkeyDecorator(sandwich);
		sandwich = new ChickenDecorator(sandwich);
		
		System.out.println(sandwich.getDescription());
		System.out.println(sandwich.cost());

		// burger with turkey and chicken
		burger = new SalamiDecorator(new BaconDecorator(new Burger()));
		
		System.out.println(burger.getDescription());
		System.out.println(burger.cost());
		
	}

}
