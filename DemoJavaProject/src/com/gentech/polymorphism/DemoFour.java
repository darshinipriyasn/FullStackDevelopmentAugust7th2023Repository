package com.gentech.polymorphism;
abstract class Artist
{
	abstract void art();
}
class Musician extends Artist
{
	void art()
	{
		System.out.println("Suraj is a musician");
	}
}
class Painter extends Artist
{
	void art()
	{
		System.out.println("Punith is a Painter");
	}
}
class Dancer extends Artist
{
	void art()
	{
		System.out.println("Manikanta is a Dancer");
	}
}
public class DemoFour {
	public static void main(String[] args) {
		Artist art1=null;
		Musician mus=new Musician();
		Painter pai=new Painter();
		Dancer dan=new Dancer();
		
		art1=mus;
		art1.art();
		art1=pai;
		art1.art();
		art1=dan;
		art1.art();
		

	}

}
