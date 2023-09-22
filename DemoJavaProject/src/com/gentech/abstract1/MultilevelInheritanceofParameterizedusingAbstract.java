package com.gentech.abstract1;
abstract class Student9
{
	String Name;
	int id;
	String gender;
	Student9(String Name,int id,String gender)
	{
		System.out.println("the name of the student in super class:" +Name);
		System.out.println("the id of the student in super class:" +id);
		System.out.println("the gender of the student in super class:" +gender);

	}
}
abstract class College9 extends Student9
{
	College9(String Name,int id,String gender)
	{
		super(Name,id,gender);
		System.out.println("the name in sub1 class:"+ Name);
		System.out.println("the id in sub1 class:"+ id);
		System.out.println("the gender in sub1 class:"+ gender);
	}
}
class library9 extends College9
{
	library9(String Name,int id,String gender)
	{
		super(Name,id,gender);
		System.out.println("the name in sub2 class:"+ Name);
		System.out.println("the id in sub2 class:"+ id);
		System.out.println("the gender in sub2 class:"+ gender);	
		}
}

public class MultilevelInheritanceofParameterizedusingAbstract {

	public static void main(String[] args) {
		library9 obj1=new library9("Ram",5623,"DSA");
		

	}

}
