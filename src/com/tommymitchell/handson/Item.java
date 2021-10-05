package com.tommymitchell.handson;

public class Item {
	private static String name;
	private boolean isPurchased;
	
	public Item(String name) {
		Item.name = name;
		this.isPurchased = false;
	}
	
	public static String getName() {
		return name;
	}
	
	public void setName(String name) {
		Item.name = name;
	}
	
	public boolean getisPurchased() {
		return isPurchased;
	}
	
	public void setisPurchased(boolean isPurchased) {
		this.isPurchased = isPurchased;
	}
	
	@Override
	public String toString() {
		String message = "" ;
		if(this.isPurchased == true) {
			message = "(Purchased)";
		}
		return Item.name + message;
	
		// TODO Auto-generated method stub
	
	}

	
}
