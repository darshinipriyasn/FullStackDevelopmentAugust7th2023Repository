package com.constructor.assignment;
class Demo
{
	void Arrays(Byte x[])
	{
		
		for(int i=x.length/2;i<x.length;i++)
		{
			System.out.println(x[i]);
		}

	}
}

public class OneDemo {

	public static void main(String[] args) {
		Demo ob=new Demo();
		Byte x[]= {10,20,30,40};
		ob.Arrays(x);

	}

}
