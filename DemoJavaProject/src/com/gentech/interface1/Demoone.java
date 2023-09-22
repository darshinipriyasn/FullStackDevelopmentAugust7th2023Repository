//multiple inheritance using more than 3 interfaces

package com.gentech.interface1;
interface Actor
{
	void showactorname(String name);
}
interface Movie
{
	void showmoviename(String name);
}
interface Language
{
	abstract void showlanguagename(String name);
}
interface Actress
{
	abstract void showactressname(String name);
}
class Production implements Actor,Movie,Language,Actress
{
	public void showactorname(String name)
	{
		System.out.println("The actor name is:"+name);
	}
	public void showmoviename(String name)
	{
		System.out.println("The movie name is:"+name);
	}
	public void showlanguagename(String name)
	{
		System.out.println("The language is:"+name);
	}
	public void showactressname(String name)
	{
		System.out.println("The actress name is:"+name);
	}
	void showproductionnmae(String name)
	{
		System.out.println("The Production name is:"+name);
	}
}
public class Demoone {
	public static void main(String[] args) {
		Production obj=new Production();
		obj.showactorname("NTR");
		obj.showmoviename("RRR");
		obj.showlanguagename("Telugu");
		obj.showactressname("Aliya bhatt");
		obj.showproductionnmae("Geeta arts");

	}

}
