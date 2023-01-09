package com.oopsconcept.interfaces;

public interface Car {// interface
	void start();
	void accelerate();
	void stop();	

}
class Audi implements Car// service provider
{

	@Override
	public void start() {
		System.out.println("audi car start with key");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Audi car accelerate");
		
	}

	@Override
	public void stop() {
		System.out.println("audi car stops");
		
	}
	
}
class Bmw implements Car// service provider
{

	@Override
	public void start() {
		System.out.println("bmw car start");
		
	}

	@Override
	public void accelerate() {
		System.out.println("bmw car accelerate");
		
	}

	@Override
	public void stop() {
		System.out.println("bmw car stops");
		
	}
	
}
