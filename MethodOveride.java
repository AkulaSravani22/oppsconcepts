package com.oopsconcept.polymorphism;

class Animal
{
	public void name() {
		System.out.println("kikk");
		
	}
}
class Goat extends Animal
{
	public void name() {
		System.out.println("pitta");
		
	}
}
public class MethodOveride {

	public static void main(String[] args) 
	{
		Animal a=new Goat();
		a.name();
	}

}
