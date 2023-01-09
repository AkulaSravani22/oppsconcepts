package com.oppsconcept.inheritance;
class Ma 
{
	public void bgm()
	{
		System.out.println("gup chip");
	}
}
class Na extends Ma
{
	public void bgm() {
		System.out.println("heee");
	}
}
class G extends Ma
{
	public void bgm() {
		
		System.out.println("govinda");
		
	}
}
public class Hirarchical {

	public static void main(String[] args) {
		
		Ma a=new G();
		a.bgm();

	}

}
