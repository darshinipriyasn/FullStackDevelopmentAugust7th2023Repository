//Hierarchical inheritance
package com.gentech.inheritance;
class Canteen10
{
	void canteen(int catid,String catname)
	{
		System.out.println("Cateen ID:"+catid);
		System.out.println("Canteen Name:"+catname);
	}
}
class Menu1 extends Canteen10
{
	void menu(int menuid,String menuname)
	{
		System.out.println("Menu ID:"+menuid);
		System.out.println("Menu Name:"+menuname);

	}
}
class Item extends Canteen10
{
	void item(int itemid,String name)
	{
		System.out.println("Item ID:"+itemid);
		System.out.println("Item Name:"+name);

	}
}


public class Demo2 {

	public static void main(String[] args) {
		Menu1 obj=new Menu1();
		obj.menu(102,"Indian");
		obj.canteen(501,"SR");

		Item obj1=new Item();
		obj1.canteen(500,"Udupi");
		obj1.item(300,"Dose");

		
	}

}
