package com.maindemo;
class Students
{
	String name;
	String emailid;
	String USN;
	String gender;
}
class Library
{
	String bookname;
	String authorname;
	String section;
	int noofbooks;
}
class Sports
{
	String name;
	String coachname;
	String itemname;
	int noofplayers;
}

public class DemoTwo {

	public static void main(String[] args) {
		Students stu = new Students();
		stu.name="Charan";
		stu.emailid="charan@gmail.com";
		stu.USN="4GH19CS013";
		stu.gender="male";
		System.out.println("name: "+stu.name);
		System.out.println("emailid: "+stu.emailid);
		System.out.println("USN: "+stu.USN);
		System.out.println("gender: "+stu.gender);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        Library lib = new Library();
        lib.bookname="Data Structures";
        lib.authorname="Richard";
        lib.section="CSE";
        lib.noofbooks=5000;
		System.out.println("bookname: "+lib.bookname);
		System.out.println("authorname: "+lib.authorname);
		System.out.println("section: "+lib.section);
		System.out.println("noofbooks: "+lib.noofbooks);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		Sports spt = new Sports();
		spt.name="Cricket";
		spt.coachname="sachin";
		spt.itemname="Bat";
		spt.noofplayers=11;
		System.out.println("name: "+spt.name);
		System.out.println("coachname: "+spt.coachname);
		System.out.println("itemname: "+spt.itemname);
		System.out.println("noofplayers: "+spt.noofplayers);
		
        

	}

}
