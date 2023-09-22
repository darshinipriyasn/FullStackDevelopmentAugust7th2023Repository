package com.constructor.assignment;
class Alphabetornot
{
	Alphabetornot(char ch)
	{
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch+":Alphabet");
		}
		else
		{
			System.out.println(ch+":is not an alphabet");
		}
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		Alphabetornot obj=new Alphabetornot('c');
		Alphabetornot obj1=new Alphabetornot('1');

	}

}
