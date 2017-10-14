package com.patterns.behavioral.iterator;

import java.util.List;

public class LunchMenuIterator implements Iterator {

	List<String> lunchMenu;
	int position = 0;
	
	public LunchMenuIterator(List<String> lunchMenu) {
		this.lunchMenu = lunchMenu;	
		}

	@Override
	public boolean hasNext() {
		if(position < lunchMenu.size())
			return true;
		return false;
	}

	@Override
	public String next() {
		String item = lunchMenu.get(position++);
		return item;
	}

}
