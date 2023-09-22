//interface extends another interface in terms of multilevel inheritance

package com.gentech.interface1;
interface Event
{
	void showeventdetails(String name);
}
interface Venu extends Event
{
	abstract void showvenudetails(String vname);
}
interface Catering extends Venu
{
	abstract void showcateringdetails(String name);
} 
class menu implements Catering
{
	public void showeventdetails(String name)
	{
		System.out.println("The Event name is:"+name);
	}
	public void showvenudetails(String vname)
	{
		System.out.println("The venu name is:"+vname);
	}
	public void showcateringdetails(String name)
	{
		System.out.println("The catering name is:"+name);
	}
	void showmenudetails(String name)
	{
		System.out.println("The menu name is:"+name);
	}
}
public class Demothree {
	public static void main(String[] args) {
		menu obj=new menu();
		obj.showeventdetails("House of Trib");
		obj.showvenudetails("Jaymahal Palace Ground");
		obj.showcateringdetails("CK Catering");
		obj.showmenudetails("Snacks");
	}
}
