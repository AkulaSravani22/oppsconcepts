package com.oppsconcept.inheritance;
class M
{
	public void bgm()
	{
		System.out.println("sarigama");
	}
}
 class N extends M
 {
	 public void bgm() {
		 System.out.println("jalsa");
	 }
 }
 class O extends N
 {
	 public void bgm()
	 {
		 System.out.println("kasi kasi");
	 }
 }


public class Multilevel {
	public static void main(String[] args)
	{
		M e=new O();
		e.bgm();
	}

}
