package com.gentech.parametrizedconstructor;
class Fruits
{
	String name;
	String color;
	String shape;
	int cost;
	Fruits(String fname,String color,String shape,int price)
	{
		name=fname;
		color=color;
		shape=shape;
		cost=price;
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("shape: "+shape);
		System.out.println("cost: "+cost);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
class Flowers
{
	String name;
	String color;
	int cost;
	String quantity;
	Flowers(String fname,String color,int price,String quantity)
	{
		name=fname;
		color=color;
		cost=price;
		quantity=quantity;
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("cost: "+cost);
		System.out.println("quantity: "+quantity);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
class Vegetables
{
	String name;
	String color;
	String taste;
	String size;
	Vegetables(String vname,String color,String taste,String size)
	{
		name=vname;
		color=color;
		taste=taste;
		size=size;
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("taste: "+taste);
		System.out.println("size: "+size);
	}
}


public class DemoSix {

	public static void main(String[] args) {
		Fruits app = new Fruits("Apple","Red","Round",55);
		Flowers rose = new Flowers("Rose","pink",70,"10grams");
		Vegetables bitter = new Vegetables("Biiter Gourd","Green","Bitter","medium");

	}

}
