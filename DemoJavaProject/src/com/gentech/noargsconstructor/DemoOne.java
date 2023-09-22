package com.gentech.noargsconstructor;
class Employee
{
	String name;
	String emailid;
	int empid;
	String gender;
	Employee(String ename,String emailid,int id,String gender)
	{
		name=ename;
		emailid=emailid;
		empid=id;
		gender=gender;
		System.out.println("name: "+name);
		System.out.println("emailid: "+emailid);
		System.out.println("empid: "+empid);
		System.out.println("gender: "+gender);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
	}
}
class Department
{
	int deptid;
	String name;
	String location;
	int totalnoofemp;
	Department(int id,String dname,String loc,int noofemp)
	{
		deptid=id;
		name=dname;
		location=loc;
		totalnoofemp=noofemp;
		System.out.println("deptid: "+deptid);
		System.out.println("name: "+name);
		System.out.println("location: "+location);
		System.out.println("totalnoofemp: "+totalnoofemp);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
	}
}
class Insurance
{
	String name;
	String type;
	int id;
	int amount;
	Insurance(String iname,String itype,int insid,int price)
	{
		name=iname;
		type=itype;
		id=insid;
		amount=price;
		System.out.println("name: "+name);
		System.out.println("type: "+type);
		System.out.println("id: "+id);
		System.out.println("amount: "+amount);

	}
}

public class DemoOne {

	public static void main(String[] args) {
		Employee obj = new Employee("Charan","charan@gmail.com",1011,"Male");
		Department obj1 = new Department(1750,"Testing","Bangalore",20);
		Insurance obj2 = new Insurance("LIC","Health ins",1250,50000);
		

	}

}
