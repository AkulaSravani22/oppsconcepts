
package com.oopsconcept.abstraction;

public abstract class Animal {
	
	abstract public void sound();
	abstract public void movement();
	public void drink()//concrete method
	{
		System.out.println("every animal drink some water");
	}

}
 class Lion extends Animal
{
	 @Override
	public void sound()
	{
		System.out.println("lion roars");
	}

	@Override
	public void movement() {
		System.out.println("walks/runs");
		
	}
}
 class Snake extends Animal{
	 
 

	@Override
	public void sound() {
		System.out.println("bushhh");
		
	}

	@Override
	public void movement() {
		System.out.println("crawls");
		
	}
 }
