package com.gentech.abstract1;
abstract class superclass
{
	 abstract void show();
}
 abstract class subclass extends superclass
{
	abstract void show2();
}
class subclass2 extends subclass
{
	void show()
	{
		System.out.println("this is a super class");
	}
	void show2()
	{
		System.out.println("this is a sub class");
	}
}

public class MultilevelInheritanceUsingAbstract {

	public static void main(String[] args) {
		subclass2 obj=new subclass2();
		obj.show();
		obj.show2();
		

	}

}
