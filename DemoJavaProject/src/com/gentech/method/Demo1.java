package com.gentech.method;
class Demo2
{
	boolean AndOp(boolean a,boolean b)//returns the result of logical operator AND
	{
		return b&&b;
	}
	String address(String s)
	{
		return s;
	}
	int elements(int x[])//returns no. of elements in a given 1D array
	{
		return x.length;
	}
	int avg(int x,int y)//returns average of 2 no.s
	{
		return (x+y)/2;
	}
	int sum()//returns sum of 1st 10 no.s
	{
		int s=0;
		for(int i=1;i<=10;i++)
		{
			s=s+i;
		}
		return s;
	}
	int fact(int x)//returns factorial of given no.
	{
		int f=1;
		for(int i=1;i<=x;i++)
		{
			f=f*i;
		}
		return f;
	}
	int divby10(int start,int end)//returns count of no.s in between 100 to 1 divisible by 10
	{
		int count = 0;
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		for (int i = start; i <= end; i++) {
			if (i % 10 == 0) {
				count++;
			}
		}

		return count;
	}
	byte[] firsthalf(byte x[])//returns first half of element from 1D byte array
	{
		byte z[]=new byte[x.length/2];
		for(int i=0;i<x.length/2;i++)
		{
			z[i]=x[i];
		}
		//System.out.println();
		return z;
	}
	short sum1(short x[])//returns sum of all elements from 1D short array
	{
		short sum = 0;
		for (short ele:x) {
			sum += ele;
		}
		return sum;
	}
	int largest(int x, int y)//returns largest no. from given 2 no.s
	{
		if(x>y)
			return x;
		else
			return y;
	}
	int smallest(int x,int y, int z)//returns smallest no. from given 3 no.s
	{
		if((x>y)&&(x>z))
		{
			return x;
		}
		else if((y>x)&&(y>z))
		{
			return y;
		}
		else
		{
			return z;
		}
	}
	boolean isAlphabet(char c)//returns the given input is alphabet or not
	{
		return (c>='a' && c<='z') || (c>='A' && c<='Z');
	}
	
	String[][] transpose(String x[][])//returns transpose of a given 2D 3x3 string array
	{
		String str[][]=new String[x.length][x[0].length];
		for (int i = 0; i <x.length; i++) 
		{
			for (int j = 0; j <x[i].length; j++)
			{
				str[i][j]=x[j][i];
			}
		}
		return str;
	}
	int square(int x[])//returns square of each elements from 1D integer array
	{
		int result=0;
		for (int i = 0; i <x.length; i++) {
			result = x[i]*x[i];
			//System.out.print(result+" ");
		}
		//System.out.println();
		return result;
	}
	int Div6()//returns no. between 1 to 100 divisible by 6
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%6==0)
			{
				System.out.print(i+" ");
			}
		}
		return i;
	}
	int getarray(int x[])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		return sum/x.length;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Demo2 obj= new Demo2();
		System.out.println("Logical AND operator result: ");
		System.out.println(obj.AndOp(false, true));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Address of our college: ");
		System.out.println(obj.address("Vijayanagar"));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		int a[]= {1,2,3,4,5,6};
		System.out.println("No. of elements in given array: ");
		System.out.println(obj.elements(a));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Average of 2 no.s: ");
		System.out.println(obj.avg(10, 15));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("sum of first 10 no.s: ");
		System.out.println(obj.sum());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("factorial of a given no. :");
		System.out.println(obj.fact(5));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("count: ");
		System.out.println(obj.divby10(1, 100));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("first half of the elements are: ");
		byte b[]= {1,2,3,4};
		byte j[]= obj.firsthalf(b);
		for(byte kk:j)
			System.out.println(kk);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		short c[]= {10,20,30,40};
		System.out.println("sum of all elements: ");
		System.out.println(obj.sum1(c));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("largest no. is: ");
		System.out.println(obj.largest(100, 144));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("smallest no. is: ");
		System.out.println(obj.smallest(10, 5, 25));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("given inputs are aplhabets are not: ");
		System.out.println(obj.isAlphabet('d'));
		System.out.println(obj.isAlphabet('1'));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		String e[][]= {{"a","b","c"},
				{"d","e","f"},
				{"g","h","i"}};
		String res[][]=obj.transpose(e);
		for(int i=0;i<res.length;i++)
		{
			for(int z=0;z<res[1].length;z++)
			{
				System.out.print(res[i][z]+" ");
			}
			System.out.println();
		}
		System.out.println("transpose: ");
		obj.transpose(e);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		int f[]= {1,2,3,4,5,6};
		System.out.println("square of all values: ");
		obj.square(f);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("numbers divisible by 6 are: ");
		obj.Div6();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

		int s[]= {1,2,3,4,5,6,7,8,9,10};
		int v1=obj.getarray(s);
		System.out.println(v1);
	
	}

}
