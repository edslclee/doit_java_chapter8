package com.ajnet.inheritance;

public class OverridingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer custLee = new Customer(202001, "이철");
		custLee.bonusPoint = 1000;
		
		System.out.println(custLee.showCustomerInfo() + "지불 금액은 : " + custLee.calcPrice(20000) + "입니다");
		
		VIPCustomer custLes = new VIPCustomer(202002,"이은실",2020001);
		custLes.bonusPoint = 2000;
		System.out.println(custLes.showCustomerInfo() + "지불 금액은 : " + custLes.calcPrice(20000) + "입니다");
	}

}
