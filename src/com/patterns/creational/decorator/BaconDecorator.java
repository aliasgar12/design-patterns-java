package com.patterns.creational.decorator;

public class BaconDecorator extends MeatDecorator {

	public BaconDecorator(FoodItem foodItem) {
		super(foodItem);	
	}

	@Override
	public String getDescription() {
		return foodItem.getDescription() + " with crispy bacon";
	}

	@Override
	public double cost() {
		return foodItem.cost() + 3.5;
	}

}
