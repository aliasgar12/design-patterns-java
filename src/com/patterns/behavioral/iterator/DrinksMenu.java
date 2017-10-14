package com.patterns.behavioral.iterator;

public class DrinksMenu implements Menu {
	
	String [] drinksMenu;
	int max_items = 6;
	int numberOfItems = 0;
	
	public DrinksMenu() {
		loadDefaultItems();
	}
	
	
	private void loadDefaultItems() {

		drinksMenu = new String[max_items];
		addItem("Corona");
		addItem("Bud Light");
		addItem("Hoegaarden");
		addItem("Stell Artois");
		addItem("Guiness");
		addItem("Heineken");
		
	}


	public void addItem(String name) 
	{
		if (numberOfItems >= max_items) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			drinksMenu[numberOfItems] = name;
			numberOfItems++;
		}
	}
	@Override
	public Iterator createIterator() {
		return new DrinksMenuIterator(drinksMenu);
	}

}
