package com.constructor.assignment;
class Loops
{
	void For()
	{
		for(int i=50;i>=40;i--)
		{
			System.out.println(i);
		}
	}
	void While()
	{
		int i=50;
		while(i>=40)
		{
			System.out.println(i);
			i--;
		}
	}
	void Dowhile()
	{
		int i=50;
		do
		{
			System.out.println(i);
			i--;
		}while(i>=40);
	}
	
	
}

public class PrintNum {

	public static void main(String[] args) {
		Loops obj = new Loops();
		obj.For();
		obj.While();
		obj.Dowhile();
	}

}
