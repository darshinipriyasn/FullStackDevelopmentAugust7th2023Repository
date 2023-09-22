package com.gentech.polymorphism;
abstract class Game
{
	abstract void typeofballgames();
}
class Volleyball extends Game
{
	void typeofballgames()
	{
		System.out.println("Bhaskar is playing Volley ball");
	}
}
class Football extends Game
{
	void typeofballgames()
	{
		System.out.println("Rajesh is playing Foot ball");
	}
}
class Throwball extends Game
{
	void typeofballgames()
	{
		System.out.println("Smitha is playing a throwball");
	}
}

public class DemoSix {

	public static void main(String[] args) {
		Game obj=null;
		Volleyball volley=new Volleyball();
		Football foot=new Football();
		Throwball throw1=new Throwball();

		obj=volley;
		obj.typeofballgames();
		obj=foot;
		obj.typeofballgames();
		obj=throw1;
		obj.typeofballgames();


	}

}
