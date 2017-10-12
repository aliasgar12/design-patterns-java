package com.patterns.creational.decorator;

public class DecoratorTest {

	public static void main(String[] args) {

		FoodItem sandwich = new Sandwich();
		FoodItem burger = new Burger();
		
		System.out.println(sandwich.getDescription());
		System.out.println(sandwich.cost());
		
		System.out.println(burger.getDescription());
		System.out.println(burger.cost());
		
	}

}
