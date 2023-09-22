package com.gentech.encapsulation;
class Maths1
{
	static Maths1 obj=null;
	private Maths1()
	{
		//It is Private Constructor
	}
	void addition(int x, int y)
	{
		int res=(x+y);
		System.out.println("Addition Result :"+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication result :"+res);
	}
	public static Maths1 getInstance()
	{
		if(obj==null)
		{
			obj=new Maths1();
		}
		return obj;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Maths1 o1=Maths1.getInstance();
		o1.addition(10, 20);
		o1.multiplication(50, 2);
		Maths1 o2=Maths1.getInstance();
		o2.addition(10, 30);
		o2.multiplication(5, 6);
		Maths1 o3=Maths1.getInstance();
		o3.addition(10, 40);
		o3.multiplication(5, 8);


	}

}
