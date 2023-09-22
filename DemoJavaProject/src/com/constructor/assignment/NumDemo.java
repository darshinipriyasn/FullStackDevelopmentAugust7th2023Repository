package com.constructor.assignment;
class Loop
{
	void For()
	{
		for(int j=50;j>=40;j--)
		{
			System.out.println(j);
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

public class NumDemo {

	public static void main(String[] args) {
		Loops obj = new Loops();
        obj.For();
        obj.Dowhile();
		obj.While();
		

	}

}
