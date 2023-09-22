package com.gentech.abstract1;
abstract class superclass10
{
	abstract void showname(String name);
}
abstract class subclass10 extends superclass10
{
	abstract void show1(int id);
}
class subclass20 extends subclass10
{
	void showname(String name)
	{
		System.out.println(name);
	}
	void show1(int id)
	{
		System.out.println(id);
	}
	
}
class subclass30 extends superclass10
{
	void showname(String name)
	{
		System.out.println(name);
	}
	
}

public class HybridInheritanceUsingAbstract {

	public static void main(String[] args) {
		subclass20 obj1=new subclass20();
		obj1.showname("Punith");
		obj1.show1(2305);
		System.out.println("++++++++++++++++++++++++++++");
		subclass30 obj2=new subclass30();
		obj2.showname("Charan");
	}

}
