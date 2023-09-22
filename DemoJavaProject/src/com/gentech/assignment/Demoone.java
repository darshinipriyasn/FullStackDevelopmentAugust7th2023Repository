package com.gentech.assignment;
class College
{
	College(String collegename,String location,String universityname)
	{
		System.out.println("College Name: "+collegename);
		System.out.println("College Location: "+location);
		System.out.println("College University: "+universityname);
    }
	College(int collegeid,int noofstudents)
	{
		System.out.println("College ID: "+collegeid);
		System.out.println("Noofstudents: "+noofstudents);
    }
}

public class Demoone {

	public static void main(String[] args) {
		College obj1=new College(17561,5000);
		College obj2=new College("Government Engineering College","Hassan","VTU");
		
		

	}

}
