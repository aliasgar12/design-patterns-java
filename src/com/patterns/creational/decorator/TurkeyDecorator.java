package com.patterns.creational.decorator;

public class TurkeyDecorator extends MeatDecorator {

	public TurkeyDecorator(FoodItem foodItem) {
		super(foodItem);	
	}

	@Override
	public String getDescription() {
		return foodItem.getDescription() + " with turkey";
	}

	@Override
	public double cost() {
		return foodItem.cost() + 2;
	}

}