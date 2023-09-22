package com.constructor.assignment;
class Reverse
{
	Reverse(int n,int sum)
	{
		while(n!=0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		System.out.println("reverse number:"+sum);
	}
}

public class Demo3 {

	public static void main(String[] args) {
		Reverse obj1=new Reverse(123,0);

	}

}
