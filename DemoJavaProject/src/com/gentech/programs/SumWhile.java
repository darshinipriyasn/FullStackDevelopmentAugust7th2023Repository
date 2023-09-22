package com.gentech.programs;

public class SumWhile {

	public static void main(String[] args) {
		int sum=0,i=250;
		while(i<=500)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		i++;
		}
		System.out.println(sum);
	}

}
