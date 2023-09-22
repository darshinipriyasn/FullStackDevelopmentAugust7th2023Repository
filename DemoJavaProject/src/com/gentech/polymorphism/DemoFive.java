package com.gentech.polymorphism;
abstract class Bank
{
	abstract void typeofaccounts();
}
class Saving extends Bank
{
	void typeofaccounts()
	{
		System.out.println("It is Saving Account");
	}
}
class Current extends Bank
{
	void typeofaccounts()
	{
		System.out.println("It is Current Account");
	}
}
class FixedDeposite extends Bank
{
	void typeofaccounts()
	{
		System.out.println("It is FixedDeposite Account");
	}
}
public class DemoFive {
	public static void main(String[] args) {
		Bank obj=null;
		Saving save=new Saving();
		Current curr=new Current();
		FixedDeposite fd=new FixedDeposite();
		
		obj=save;
		obj.typeofaccounts();
		obj=curr;
		obj.typeofaccounts();
		obj=fd;
		obj.typeofaccounts();
		
		

	}

}
