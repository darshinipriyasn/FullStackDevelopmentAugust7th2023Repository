package com.constructor.assignment;
class Operator
{
	void And(boolean x,boolean y)
	{
		boolean v1=x && y;
		System.out.println(v1);
		
	}
	void OR(boolean x,boolean y)
	{
		boolean v1=x || y;
		System.out.println(v1);
		
	}
	void NOT(boolean x)
	{
		boolean v1=x ;
		System.out.println(v1);
		
	}
	
}

public class OperatorDemo {

	public static void main(String[] args) {
		Operator obj = new Operator();
		boolean a=true;
		boolean b=false;
		obj.And(a,b);
		obj.And(a,a);
		obj.OR(b,a);
		obj.NOT(b);
		obj.NOT(a);
	}

}
