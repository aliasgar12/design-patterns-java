package com.patterns.creational.decorator;

public class Sandwich implements FoodItem{
	
	@Override
	public String getDescription() {
		return "You got yourself an awesome sandwich.";
	}

	@Override
	public double cost() {
		return 5.5;
	}

}
