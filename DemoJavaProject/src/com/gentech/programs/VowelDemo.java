package com.gentech.programs;

public class VowelDemo {

	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println(ch+ "is a vowel");
		}
		else if (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
		{
			System.out.println(ch+ "is a vowel");
		}
	     
		else
		{
			System.out.println("it is not a vowel");

		}
   }
}


