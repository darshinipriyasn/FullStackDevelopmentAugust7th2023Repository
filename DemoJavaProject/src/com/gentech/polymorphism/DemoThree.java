package com.gentech.polymorphism;
abstract class instrument
{
	abstract void play();
}
class violen extends instrument
{
	void play() 
	{
		System.out.println("Rahul is playing Drum");
	}
}
class Gitra extends instrument
{
	void play() 
	{
		System.out.println("Rohit is playing Gitra");
	}
}
class Piano extends instrument
{
	void play() 
	{
		System.out.println("Ranjan is playing Piano");
	}
}
public class DemoThree {
	public static void main(String[] args) {
		instrument ins=null;
		violen vio=new violen();
		Gitra gi=new Gitra();
		Piano pi=new Piano();
		
		ins=vio;
		ins.play();
		ins=gi;
		ins.play();
		ins=pi;
		ins.play();

	}

}
