package com.oopsconcept.interfaces;


class Driver
{
	Car c;
	public Driver(Car c)//loose coupling
	{
		this.c=c;
	}
	public void drive() {// providing 100% data abstraction 
		c.start();
		c.accelerate();
		c.stop();
		
	}
	
}
public class CarClass {

	public static void main(String[] args) {
		 
		Driver d=new Driver(new Audi());
		d.drive();
		System.out.println("--------------");
		Driver d1=new Driver(new Bmw());
		d1.drive();
		

	}

}
