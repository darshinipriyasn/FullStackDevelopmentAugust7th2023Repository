package com.gentech.inheritance;
class superclass
{
	int x;
	String y;
	superclass(int x, String y)
	{
		this.x=x;
		this.y=y;
		System.out.println("constructor1 of superclass: x="+x+" y="+y);
	}
	superclass(int x)
	{
		this.x=x;
		System.out.println("constructor2 of superclass: x="+x);
	}
	
}
class subclass extends superclass
{
	subclass(int x)
	{
		super(x);
		System.out.println("subclass constructor1: x="+x);
	}
	subclass(int x, String y)
	{
		super(x,y);
		System.out.println("subclass constructor2: x="+x+" y="+y);
	}
}
class subclass10 extends superclass
{
	subclass10(int x)
	{
		super(x);
		
	}
	subclass10(int x, String y)
	{
		super(x,y);
		
	}
}


public class Demo9 {

	public static void main(String[] args) {
		subclass obj1=new subclass(10);
		System.out.println("---------------------------");
		subclass obj2=new subclass(20,"santosh");


	}

}
