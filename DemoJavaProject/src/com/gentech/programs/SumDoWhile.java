package com.gentech.programs;

public class SumDoWhile {

	public static void main(String[] args) {
		int sum=0, i=50;
		do
		{
			if(i%2==1) 
			{
				sum=sum+i;
			}
			
			i++;
		}while(i<=100);
		System.out.println(sum);
    }

}
