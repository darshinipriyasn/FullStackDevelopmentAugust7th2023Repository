package com.gentech.polymorphism;
abstract class Calculator
{
	abstract void function();
}
class Addition extends Calculator
{
	void function()
	{
		int x,y;
		x=10;y=20;
		System.out.println("The addition of x and y is:"+(x+y));
	}
}
class Subraction extends Calculator
{
	void function()
	{
		int x,y;
		x=65;y=43;
		System.out.println("The Subraction of x and y is:"+(x-y));
	}
}
class Multiplication extends Calculator
{
	void function()
	{
		int x,y;
		x=32;y=5;
		System.out.println("The Multiplication of x and y is:"+(x*y));
	}
}
class Division extends Calculator
{
	void function()
	{
		int x,y;
		x=60;y=5;
		System.out.println("The division of x and y is:"+(x/y));
	}
}
public class DemoTwo {
	public static void main(String[] args) {
		Calculator cal=null;
		Addition add=new Addition();
		Subraction sub=new Subraction();
		Multiplication mul=new Multiplication();
		Division div=new Division();
		
		cal=add;
		cal.function();
		cal=sub;
		cal.function();
		cal=mul;
		cal.function();
		cal=div;
		cal.function();

		
	}

}
