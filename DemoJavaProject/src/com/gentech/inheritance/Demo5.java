package com.gentech.inheritance;
class Employee
{
	Employee(String firstname,int empid)
	{
		System.out.println("First Name:" +firstname);
		System.out.println("Employee ID:" +empid);
	}
}
class Department extends Employee
{
	String deptname;
	Department(String firstname,int empid,String deptname)
	{
		super(firstname,empid);
		this.deptname=deptname;
		System.out.println("D Name:" +deptname);
	}
}
class Canteen extends Department
{
	String catname;
	Canteen(String firstname,int empid,String deptname,String catname)
	{
		super(firstname,empid,deptname);
		this.catname=catname;
		System.out.println("Canteen Name:" +catname);
	}
}

public class Demo5 {

	public static void main(String[] args) {
		Department obj=new Department("Priya",101,"Development");
		Department obj1=new Department("Chaithra",102,"Testing");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		Canteen obj2=new Canteen("Charan",2013,"Testing","Cafe club");

	}

}
