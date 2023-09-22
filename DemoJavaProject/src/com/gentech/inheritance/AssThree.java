//multilevel inheritance with same data type and variables

package com.gentech.inheritance;
class university55
{
	String uname;
	int uid;
	void show()
	{
		System.out.println("superclass: name="+uname);
		System.out.println("superclass: id="+uid);
	}
}
class college55 extends university55
{
	String uname;
	int uid;
	
	college55(String name,int id)
	{
		super.uname=name;
		super.uid=id;
	}
	void display1()
	{
		System.out.println("1st subclass: name="+uname);
		System.out.println("1st subclass: id="+uid);
	}
}

class department55 extends college55
{
	String uname;
	int uid;
	department55(String name,int id)
	{
		super(name,id);
		super.uname=name;
		super.uid=id;
	}
	void display2()
	{
		System.out.println("2nd subclass: name="+uname);
		System.out.println("2nd subclass: id="+uid);
	}
}

public class AssThree {

	public static void main(String[] args) {
		department55 d1=new department55("vtu",100);
		d1.show();
		System.out.println("----------------------------");
		d1.display1();
		System.out.println("----------------------------");
		d1.display2();
	}

	}


