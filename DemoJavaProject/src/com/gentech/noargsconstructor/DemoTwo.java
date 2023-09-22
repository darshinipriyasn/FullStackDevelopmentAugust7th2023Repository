package com.gentech.noargsconstructor;

class Students
{
	String name;
	String emailid;
	String USN;
	String gender;
	Students()
	{
		name="Charan";
	    emailid="charan@gmail.com";
		USN="4GH19CS013";
		gender="male";
		System.out.println("name: "+name);
		System.out.println("emailid: "+emailid);
		System.out.println("USN: "+USN);
		System.out.println("gender: "+gender);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
	}
}
class Library
{
	String bookname;
	String authorname;
	String section;
	int noofbooks;
	Library()
	{
		bookname="Data Structures";
        authorname="Richard";
        section="CSE";
        noofbooks=5000;
		System.out.println("bookname: "+bookname);
		System.out.println("authorname: "+authorname);
		System.out.println("section: "+section);
		System.out.println("noofbooks: "+noofbooks);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
	}
}
class Sports
{
	String name;
	String coachname;
	String itemname;
	int noofplayers;
	Sports()
	{
		name="Cricket";
		coachname="sachin";
		itemname="Bat";
		noofplayers=11;
		System.out.println("name: "+name);
		System.out.println("coachname: "+coachname);
		System.out.println("itemname: "+itemname);
		System.out.println("noofplayers: "+noofplayers);
	}
}

public class DemoTwo {

	public static void main(String[] args) {
		Students stu = new Students();
		Library lib = new Library();
		Sports spt = new Sports();

	}

}
