package com.ajnet.polymorphism;

public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer custLee = new Customer(202001, "이철");
		custLee.bonusPoint = 1000;
		System.out.println(custLee.showCustomerInfo());
		
		VIPCustomer custLes = new VIPCustomer(202002,"이은실",2020001);
		custLes.bonusPoint = 2000;
		System.out.println(custLes.showCustomerInfo());
		
		GoldCustomer custLsm = new GoldCustomer();
		custLsm.setCustomerID(202003);
		custLsm.setCustomerName("이수민");
		custLsm.setCustomerGrade("Gold");
		System.out.println(custLsm.showCustomerInfo());
				
	}
	
}
