package com.gentech.programs;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num%2==0)
		{
			System.out.println(num+ "is a Even Number");
		}
		else
		{
			System.out.println(num+ "is a Odd Number");
		}

	}

}
