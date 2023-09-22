//Simple inheritance
package com.gentech.inheritance;
class Students10
{
	void Student (String name,int roll)
	{
		System.out.println("Student Name:"+name);
		System.out.println("rollno :"+roll);

	}
}
class College extends Students10
{
	void college (int clgid,String name)
	{
		System.out.println("College ID :"+clgid);
		System.out.println("College Name :"+name);

	}
}

public class Demo1 {

	public static void main(String[] args) {
		College obj=new College();
		obj.college(102,"GECH");
		obj.Student("Priya", 652);

	}

}
