package com.constructor.assignment;

public class Primenum {

	public static void main(String[] args) {
		int num=7;
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
				
			}
		}
		if(flag==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
