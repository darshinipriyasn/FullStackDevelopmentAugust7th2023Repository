package com.gentech.abstract1;
abstract class student8
{
	String name;
	int id;
	student8(String fname,int id)
	{
		this.name=fname;
		this.id=id;
		System.out.println("superclass constructor1: name="+fname);
		System.out.println("superclass constructor1: id="+id);

	}
	student8(int id)
	{
		this.id=id;
		System.out.println("superclass constructor2: id="+id);
	}
	student8(String fname)
	{
		this.name=fname;
		System.out.println("superclass constructor3: name="+fname);
	}
}
abstract class college8 extends student8
{
	college8(String name,int id)
	{
		super(name,id);
		System.out.println("subclass1 constructor1 name=" +name);
		System.out.println("subclass1 constructor1 id=" +id);

	}
	college8(int id)
	{
		super(id);
		System.out.println("subclass1 constructor2: id="+id);
	}
	college8(String name)
	{
		super(name);
		System.out.println("subclass1 constructor3: name="+name);
	}
}
class canteen8 extends college8
{
	canteen8(String name,int id)
	{
		super(name,id);
		System.out.println("subclass2 constructor1 name=" +name);
		System.out.println("subclass2 constructor1 id=" +id);

	}
	canteen8(int id)
	{
		super(id);
		System.out.println("subclass2 constructor2: id="+id);
	}
	canteen8(String name)
	{
		super(name);
		System.out.println("subclass2 constructor3: name="+name);
	}
}


public class MultilevelinheritancewithConstructoroverloadingUsingAbstract {

	public static void main(String[] args) {
		canteen8 o1=new canteen8("vinay",1001);
		System.out.println("++++++++++++++++++++++++++");
		canteen8 o2=new canteen8("suraj");
		System.out.println("+++++++++++++++++++++++++++++");
		canteen8 o3=new canteen8(1003);


	}

}
