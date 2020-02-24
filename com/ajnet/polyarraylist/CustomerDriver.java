package com.ajnet.polyarraylist;

import java.util.ArrayList;

public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Customer> customerList = new ArrayList<Customer>();
				
		Customer custLee = new Customer(202001, "이철");
//
//		System.out.println(custLee.showCustomerInfo());
		customerList.add(custLee);
	
		
		VIPCustomer custLes = new VIPCustomer(202002,"이은실",2020001);
//		custLes.bonusPoint = 2000;
//		System.out.println(custLes.showCustomerInfo());
		customerList.add(custLes);
		
		GoldCustomer custLsm = new GoldCustomer(202003,"이수민");
//		custLsm.setCustomerID(202003);
//		System.out.println(custLsm.showCustomerInfo());
		customerList.add(custLsm);
		
		System.out.println("-------- 고객 정보 출력 ------------");
		for(int i = 0; i < customerList.size(); i++) {
			System.out.println(customerList.get(i).showCustomerInfo());
		}
 
//        for(Customer customer : customerList){
//        	System.out.println(customer.showCustomerInfo());
//       }
  	
		int price = 10000;
		System.out.println("-------- 할인율과 보너스 포인트 결과 출력------------");
		for(Customer customer : customerList){
			
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "님의 할인이 적용된 금액은 " + cost + "입니다");
			System.out.println(customer.showCustomerInfo());
			
		}
		
		
	}
	
}
