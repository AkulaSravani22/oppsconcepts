package com.oopsconcept.abstraction;
public class AnimalClass {

	public static void main(String[] args) {
		 
		Animal a=new Lion();
		a.drink();
		a.sound();
		a.movement();
		Animal a1=new Snake();
		a1.sound();
		a1.movement();
		a1.drink();

	}

}
