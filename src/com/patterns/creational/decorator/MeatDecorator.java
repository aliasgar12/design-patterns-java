package com.patterns.creational.decorator;

public abstract class MeatDecorator implements FoodItem {
	
	protected FoodItem foodItem;
	
	public MeatDecorator(FoodItem foodItem){
		this.foodItem = foodItem;
	}

	@Override
	public String getDescription() {
		return foodItem.getDescription();
	}

	@Override
	public double cost() {
		return foodItem.cost();
	}	

}
