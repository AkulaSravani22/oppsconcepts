package com.oopsconcept.polymorphism;

public class MethodOver {
	
	public static void m1() {
		System.out.println("janu");
		
	}
	public static void m1(int j,int i)
	{
		System.out.println("sasi");
	}
	public  static void m1(int i) {
		System.out.println("janshi");
		
	}

	public static void main(String[] args) {
		MethodOver.m1();
		MethodOver.m1(10,20);
		MethodOver.m1(10);

	}

}
