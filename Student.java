package com.oopsconcept.encapsulation;
class Details
{
	private int i;
	private String name;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Student {

	public static void main(String[] args) {
		
   Details d=new Details();
   d.setI(1);
   System.out.println(d.getI());
   d.setName("sravani");
   System.out.print(d.getName());
	
	}

}
