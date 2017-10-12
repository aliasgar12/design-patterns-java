package com.patterns.creational.decorator;

public class Burger implements FoodItem {

	@Override
	public String getDescription() {
		return "You got yourself a burger. Enjoy !!"; 
	}

	@Override
	public double cost() {
		return 6;
	}

}
