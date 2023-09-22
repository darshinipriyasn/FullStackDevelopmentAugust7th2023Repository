package com.gentech.assignment;
class Students
{
	Students(String stuname,String email,String gender,String USN,String address)
	{
		System.out.println("Student Name: "+stuname);
		System.out.println("Student Email: "+email);
		System.out.println("Student Gender: "+gender);
		System.out.println("Student USN: "+USN);
		System.out.println("Student Address: "+address);
    }
	Students(long phone)
	{
		System.out.println("Student Phone: "+phone);
	}
}

public class DemoFour {

	public static void main(String[] args) {
		Students obj1= new Students("Priya","priya@gmail.com","Female","4GH19CS013","Sidlaghatta");
        Students obj2=new Students(9964343461L);
	}

}
