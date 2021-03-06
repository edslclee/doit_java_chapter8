package com.ajnet.polyarraylist;

public class GoldCustomer extends Customer {
	
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override 
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * bonusRatio);
		
	}

	
}
