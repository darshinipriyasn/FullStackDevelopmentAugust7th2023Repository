package com.gentech.parametrizedconstructor;

class Students
{
	String name;
	String emailid;
	String USN;
	String gender;
	Students(String sname,String emailid,String sid,String gender)
	{
		name=sname;
	    emailid=emailid;
		USN=sid;
		gender=gender;
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
	Library(String bname,String aname,String section,int noofbook)
	{
		bookname=bname;
        authorname=aname;
        section=section;
        noofbooks=noofbook;
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
	Sports(String sname,String cname,String iname,int noofplayer)
	{
		name=sname;
		coachname=cname;
		itemname=iname;
		noofplayers=noofplayer;
		System.out.println("name: "+name);
		System.out.println("coachname: "+coachname);
		System.out.println("itemname: "+itemname);
		System.out.println("noofplayers: "+noofplayers);
	}
}


public class DemoTwo {

	public static void main(String[] args) {
		Students obj = new Students("Priya","priya@gmail.com","4GH19CS013","Female");
		Library obj1 = new Library("Data Structures","Richard","CSE",5000);
		Sports obj2 = new Sports("Batmitton","Ram","Bats",2);

		

	}

}
