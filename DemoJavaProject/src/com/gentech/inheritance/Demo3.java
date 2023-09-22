//Hybrid inheritance
package com.gentech.inheritance;
class Bank1
{
	void bank (int id,String name )
	{
		System.out.println("Bank ID:"+id);
		System.out.println("Bank name:"+name);

	}
}
class Account extends Bank1
{
	void account(int acctno,String Name)
	{
		System.out.println("Account NO:"+acctno);
		System.out.println("Account Name:"+Name);

	}
}
class Branch extends Account
{
	void branch(int id,String name)
	{
		System.out.println("Branch NO:"+id);
		System.out.println("Branch Name:"+name);

	}
}
class Manager extends Bank1
{
	void manager(int id,String name)
	{
		System.out.println("Manager NO:"+id);
		System.out.println("Manager Name:"+name);
	}
}


public class Demo3 {

	public static void main(String[] args) {
		Branch obj=new Branch();
		obj.bank(100,"Canara");
		obj.account(152463,"Saving");
		obj.branch(65,"Kolar");
		
		Manager obj1=new Manager();
		obj1.manager(256, "Suraj");
		obj1.bank(35,"Canara");
	}
}
