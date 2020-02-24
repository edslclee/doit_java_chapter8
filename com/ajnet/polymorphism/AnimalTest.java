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
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 나릅니다.");
	}
}
public class AnimalTest {
    
	public static void main(String[] args) {
	/*	
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());

//		Animal a = new Human();		
	}
		
	public void moveAnimal(Animal animal) {
		animal.move();
	}
*/ 
		Animal animal = new Animal();
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		animal.move();
		human.move();
		tiger.move();
		eagle.move();
		
		if(human instanceof Human) {
			((Human) human).readBook();
		}
		if(tiger instanceof Tiger) {
			((Tiger) tiger).hunting();
			
		}
	}

}
