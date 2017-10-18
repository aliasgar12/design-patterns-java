package com.patterns.behavioral.iterator;

public class Restaurant {

	public static void main(String args[]){
		
		DrinksMenu drinksMenu = new DrinksMenu();
		LunchMenu lunchMenu = new LunchMenu();
		
		
		// creating iterators for both the classes.
		
		Iterator drinksMenuIterator = drinksMenu.createIterator();
		Iterator lunchMenuIterator = lunchMenu.createIterator();
		
		
		// traversing through all the elements in the iterators
		
		System.out.println("Here is the drinks menu - ");
		while(drinksMenuIterator.hasNext())
			System.out.println(drinksMenuIterator.next());
		
		System.out.println();
		
		System.out.println("Here is the lunch menu - ");
		while(lunchMenuIterator.hasNext())
			System.out.println(lunchMenuIterator.next());
		
	

		
	}
}
