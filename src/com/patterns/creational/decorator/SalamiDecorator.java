package com.patterns.creational.decorator;

public class SalamiDecorator extends MeatDecorator {

	public SalamiDecorator(FoodItem foodItem) {
		super(foodItem);	
	}

	@Override
	public String getDescription() {
		return foodItem.getDescription() + " with salami";
	}

	@Override
	public double cost() {
		return foodItem.cost() + 3;
	}

}