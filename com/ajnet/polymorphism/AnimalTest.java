package com.ajnet.polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 걷습니다");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 걷습니다");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 걷습니다");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 아릅니다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
//		Animal a = new Human();		
	}
		
	public void moveAnimal(Animal animal) {
		animal.move();
	}
		

}
