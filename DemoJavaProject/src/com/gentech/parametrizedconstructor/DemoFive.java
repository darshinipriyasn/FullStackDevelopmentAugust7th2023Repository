package com.gentech.parametrizedconstructor;

class Country
{
	String name;
	String nationallanguage;
	int noofstates;
	String capital;
	Country(String cname,String language,int noofstate,String capital)
	{
		name=cname;
		nationallanguage=language;
		noofstates=noofstate;
		capital=capital;
		System.out.println("name: "+name);
		System.out.println("nationallanguage: " +nationallanguage);
		System.out.println("noofstates: "+noofstates);
		System.out.println("capital: "+capital);
		System.out.println("+++++++++++++++++++++++++");
	}
}
class State
{
	String name;
	String Language;
	int noofdist;
	String capital;
	State(String sname,String language,int noofdist,String captial)
	{
		name=sname;
		Language=language;
		noofdist=noofdist;
		capital=captial;
		System.out.println("name: "+name);
		System.out.println("language: " +Language);
		System.out.println("noofdist: "+noofdist);
		System.out.println("capital: "+capital);
		System.out.println("+++++++++++++++++++++++++");
	}
}
class District
{
	String name;
	int nooftaluks;
	String famousplace;
	int pincode;
	District(String dname,int nooftaluk,String famousplace,int pincode)
	{
		name=dname;
	    nooftaluks=nooftaluk;
		famousplace=famousplace;
		pincode=pincode;
		System.out.println("name: "+name);
		System.out.println("nooftaluks: " +nooftaluks);
		System.out.println("famousplace: "+famousplace);
		System.out.println("pincode: "+pincode);
		System.out.println("+++++++++++++++++++++++++");
		
	}
}


public class DemoFive {

	public static void main(String[] args) {
		Country obj = new Country("India","Hindi",29,"Delhi");
		State obj1 = new State("Karnataka","Kannada",30,"Bangalore");
		District obj2 = new District("Chickballapura",6,"Nandihills",562105);

	}

}
