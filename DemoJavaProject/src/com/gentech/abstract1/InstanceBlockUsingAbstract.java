package com.gentech.abstract1;
abstract class Student 
{
	{
		System.out.println("instance block in abstract class");

	}
}
class College extends Student
{
	
	
}

public class InstanceBlockUsingAbstract {

	public static void main(String[] args) {
		College obj=new College();

	}

}
