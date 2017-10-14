package com.patterns.behavioral.iterator;

public class DrinksMenuIterator implements Iterator {

	String []drinksMenu;
	int position = 0;
	
	public DrinksMenuIterator(String[] drinksMenu) {
		this.drinksMenu = drinksMenu;
	}

	@Override
	public boolean hasNext() {
		if(position < drinksMenu.length && drinksMenu[position] != null )
				return true;
		return false;
	}

	@Override
	public String next() {
		String item = drinksMenu[position++];
		return item;
	}

}
