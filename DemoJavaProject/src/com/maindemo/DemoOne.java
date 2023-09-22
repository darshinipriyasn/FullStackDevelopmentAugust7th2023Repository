package com.maindemo;
class Employee
{
	String name;
	String emailid;
	int empid;
	String gender;
}
class Department
{
	int deptid;
	String name;
	String location;
	int totalnoofemp;
}
class Insurance
{
	String name;
	String type;
	int id;
	int amount;
}

public class DemoOne {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name="Sanjay";
		emp.emailid="sanjay@gmail.com";
		emp.empid=1001;
		emp.gender="Male";
		System.out.println("name: "+emp.name);
		System.out.println("emailid: "+emp.emailid);
		System.out.println("empid: "+emp.empid);
		System.out.println("gender: "+emp.gender);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		Department dept = new Department();
		dept.deptid=2001;
		dept.name="Testing";
		dept.location="Bangalore";
		dept.totalnoofemp=15;
		System.out.println("deptid: "+dept.deptid);
		System.out.println("name: "+dept.name);
		System.out.println("location: "+dept.location);
		System.out.println("totalnoofemp: "+dept.totalnoofemp);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		Insurance ins = new Insurance();
		ins.name="LIC";
		ins.type="Health Insurance";
		ins.id=100;
		ins.amount=100000;
		System.out.println("name: "+ins.name);
		System.out.println("type: "+ins.type);
		System.out.println("id: "+ins.id);
		System.out.println("amount: "+ins.amount);

		

	}

}
