//interface which contains more than three variables

package com.gentech.interface1;
interface Employee
{
	void show1(String ename,int id,String email,String gender);
}
interface Department
{
	abstract void show2(String dname,int id,String location,int noofemp);
}
class Location implements Employee,Department
{
	public void show1(String ename,int id,String email,String gender)
	{
		System.out.println("The Employee name is:"+ename);
		System.out.println("The Employee id is:"+id);
		System.out.println("The Employee email is:"+email);
		System.out.println("The Employee gender is:"+gender);
	}
	public void show2(String dname,int id,String location,int noofemp)
	{
		System.out.println("The Department name is:"+dname);
		System.out.println("The Department id is:"+id);
		System.out.println("The Department location is:"+location);
		System.out.println("The Department noofemp is:"+noofemp);
	}
	void show3(String state,String city,String address,int pincode)
	{
		System.out.println("The State name is:"+state);
		System.out.println("The city name is:"+city);
		System.out.println("The address :"+address);
		System.out.println("The pincode:"+pincode);
	}
 }
public class Demotwo {
	public static void main(String[] args) {
		Location obj=new Location();
		obj.show1("Sanjay",1011,"sanjay@gmail.com","male");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		obj.show2("testing",90091,"Mumbai",15);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		obj.show3("Karnataka", "bangalore", "2 main road,6th block,R R nagaar",560030);

	}

}
