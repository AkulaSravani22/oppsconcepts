package com.oppsconcept.inheritance;
 class Model
{
  public  void bgm() {
	System.out.println("bgm");
}
}
 class Brand extends Model{
	 public void bgm() {
		 System.out.println("fm radio");
		
	}
 }

public class SingleInheritance {

	public static void main(String[] args) {
		
		Model b=new Brand();// up casting
		b.bgm();

	}

}
