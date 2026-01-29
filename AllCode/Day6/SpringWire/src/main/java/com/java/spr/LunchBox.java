package com.java.spr;

public class LunchBox {
	
	private String snacks;
	
	public void eat() {
		System.out.println("Eating : " +snacks);
	}

	public String getSnacks() {
		return snacks;
	}

	public void setSnacks(String snacks) {
		this.snacks = snacks;
	}

	
}
