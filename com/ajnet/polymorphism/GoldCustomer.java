package com.ajnet.polymorphism;

public class GoldCustomer extends Customer{
	
	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	
	// @Override annotation : compiler에게 override되었음을 알려준다
	// override되었으므로 public int calcPrice(int price) { 를 변경하면
	// error가 발생한다
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
}
