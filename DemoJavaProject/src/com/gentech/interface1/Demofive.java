// interface extends another interface in terms of Hierarchical inheritance

package com.gentech.interface1;
interface Bank
{
	void showbankdetails(String name);
}
interface Account extends Bank
{
	abstract void showaccountdetails(String name);
}
interface Customer extends Bank
{
	abstract void showcustomerdetails(String name,int id);
}
class Location10 implements Account
{
	public void showaccountdetails(String name)
	{
		System.out.println("the account type is:"+name);
	}
	public void showbankdetails(String name)
	{
		System.out.println("the bank name is:"+name);
	}
	void showlocationdetails(String name)
	{
		System.out.println("the location name is:"+name);
	}
}
class Manager implements Customer
{
	public void showcustomerdetails(String name,int id)
	{
		System.out.println("the customer name is:"+name);
		System.out.println("the customer id is:"+id);
	}
	public void showbankdetails(String name)
	{
		System.out.println("the bank name is:"+name);
	}
	void showmanagerdetails(String name,String gender)
	{
		System.out.println("the manager name is:"+name);
		System.out.println("the gender is:"+gender);
	}
}
public class Demofive {
	public static void main(String[] args) {
		Location10 obj=new Location10();
		obj.showbankdetails("canara");
		obj.showaccountdetails("saving");
		obj.showlocationdetails("kolar");
		System.out.println("+++++++++++++++++++++++++");
		Manager obj1=new Manager();
		obj1.showbankdetails("SBI");
		obj1.showcustomerdetails("Zabi",5001);
		obj1.showmanagerdetails("Keerthi", "male");

	}

}
