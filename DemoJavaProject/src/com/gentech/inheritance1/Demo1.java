package com.gentech.inheritance1;
class Employee5
{
	void showname(String name,int id)
	{
		System.out.println("The Employee name in parent class is:" +name);
		System.out.println("The Employee ID in parent class is:" +id);
	}
}
class Department5 extends Employee5
{
	Department5(String name,int id)
	{
		super.showname(name,id);
	}
	void showname(String name,int id)
	{
		System.out.println("The Department name in child class is:" +name);
		System.out.println("The Department id in child class is:" +id);

	}
}
class Canteen5 extends Department5
{
	Canteen5(String name,int id)
	{
		super(name,id);
		super.showname(name,id);
	}
	void showcanteenname(String name,int id)
	{
		System.out.println("The Canteen name in grandchild class is:" +name);
		System.out.println("The Canteen id in grandchild class is:" +id);

	}
}

public class Demo1 {

	public static void main(String[] args) {
		Canteen5 obj=new Canteen5("XYZ",202);
		System.out.println("+++++++++++++++++++++++++");
		obj.showname("YSR",203);


	}

}
