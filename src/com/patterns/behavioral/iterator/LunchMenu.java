package com.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class LunchMenu implements Menu {

	List<String> lunchMenu = new ArrayList<String>();
	
	
	public LunchMenu(){
		loadDefaultMenuItems();
	}
	
	private void loadDefaultMenuItems() {
		lunchMenu.add("Pasta with Alfredo");
		lunchMenu.add("Lasagna");
		lunchMenu.add("Chicken Curry");
		lunchMenu.add("Chicken Rara");
		lunchMenu.add("Sushi");
		lunchMenu.add("Burrito");
		lunchMenu.add("Biryani");

	}

	@Override
	public Iterator createIterator() {
		
// 		List has an inbuilt iterator provided by the Java library.
//		return (Iterator) lunchMenu.iterator();
		
		return new LunchMenuIterator(lunchMenu);
	}
	
	
}
