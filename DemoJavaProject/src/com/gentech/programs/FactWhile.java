package com.gentech.programs;

public class FactWhile {

	public static void main(String[] args) {
		int i=1,fact=1;
		int num=Integer.parseInt(args[0]);
		while(i<=num)
		{
			fact*=i;
			i++;
		}
		System.out.println(fact);

	}

}
