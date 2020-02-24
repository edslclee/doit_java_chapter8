package com.ajnet.polymorphism;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 달립니다");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 두 날개로 하늘을 납니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		animal.move();
		
	}

}
