package com.gentech.programs;

public class SquareDoWhile {

	public static void main(String[] args) {
		int sum=0, i=20;
		do
		{
			sum=sum+(i*i);
			i--;
		}while(i>=1);
		System.out.println(sum);

	}

}
