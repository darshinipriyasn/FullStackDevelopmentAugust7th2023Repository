package com.gentech.abstract1;
abstract class Fruit
{
	void show(String name,String color)
	{
		System.out.println("the name is:"+ name);
		System.out.println("the color is:" +color);
	}
}
class Vegetable extends Fruit
{
	
		
	
}

public class NoargsconstructorUsingAbstract {
	public static void main(String[] args) {
		Vegetable obj5=new Vegetable();
		obj5.show("mango", "yellow");

	}

}
