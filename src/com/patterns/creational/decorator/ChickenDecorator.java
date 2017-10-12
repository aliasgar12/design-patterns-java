package com.patterns.creational.decorator;

public class ChickenDecorator extends MeatDecorator{

	public ChickenDecorator(FoodItem foodItem) {
		super(foodItem);
	}
	
	@Override
	public String getDescription() {
		return foodItem.getDescription() + " with grilled chicken";
	}

	@Override
	public double cost() {
		return foodItem.cost() + 2.5;
	}	

}
