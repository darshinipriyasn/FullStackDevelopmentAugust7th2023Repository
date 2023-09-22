package com.gentech.staticassignments;
class maths10
{
	//Display odd numbers between 20 to 40
	static int x=20;
	static void shownumbers()
	{
		if(x<=40)
		{
			if(x%2==1)
			{
				System.out.println(x);
			}
			x++;
			shownumbers();
		}
	}

	//Display Even number between 20 to 1

	static int a=20;
	static void shownumber()
	{
		if(a>=1)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			a--;
			shownumber();
		}
	}

	//Display number divisible by 8
	static int z=1;
	static void shownumberdivisibleby8()
	{
		if(z<=100)
		{
			if(z%8==0)
			{
				System.out.println(z);
			}
			z++;
			shownumberdivisibleby8();
		}
	}

	//Display count of numbers divisible by 10
	static int count=1;
	static int sum=0;
	static void display()
	{
		if(count<=10)
		{
			sum=sum+count;
			count=count+1;
			display();
			}
	}
	static void showCount()
	{
		System.out.println(sum);
	}


	//sum of first 20numbers
	/*static int y=1, sum=0;
	static void showsumoffirst20numbers()
	{
		if(y<=20) 
		{
			sum=sum+y;
		
			y++;
		}
			System.out.println(sum);
		
		

		showsumoffirst20numbers();
	}*/
		

	
	// Display Tenth Table
	static int i=1;
	static void showtentable()
	{
		if(i<=10)
		{
			System.out.println("10*"+i+"="+i*10);

			i++;
			showtentable();
		}
	}
	//Display fiveTable in reverse
	static int p=10;
	static void showfivetable()
	{
		if(p>=1)
		{
			System.out.println("5*"+p+"="+p*5);
			p--;
			showfivetable();

		}
	}


}

public class AssignmentPrograms {

	public static void main(String[] args) {
		maths10.shownumbers();
		System.out.println("++++++++++++++++++++++++++++++++++");
		maths10.shownumber();
		System.out.println("++++++++++++++++++++++++++++++++++");
		maths10.shownumberdivisibleby8();
		System.out.println("++++++++++++++++++++++++++++++++++");
		maths10.display();
		maths10.showCount();
		System.out.println("++++++++++++++++++++++++++++++++++");
		maths10.showtentable();
		System.out.println("++++++++++++++++++++++++++++++++++");
		maths10.showfivetable();
	}

}
