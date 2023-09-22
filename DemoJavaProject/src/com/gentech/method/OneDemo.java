package com.gentech.method;
class Demo
{
	//BYTE ARRAY READ SECOND HALF OF THE ELEMENTS
	void Arrays(Byte x[])
	{

		for(int i=x.length/2;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}

	}
	//1D SHORT ARRAY FIRST HALF OF THE ELEMENTS
	void Arrays(short a[])
	{
		for(int i=0;i<a.length/2;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	//1D INTEGER ARRAY FIRST HALF OF THE ELEMENTS IN REVERSE ORDER
	void intarrays(int b[])
	{
		for(int i=(b.length/2)-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
	}
	//1D STRING ARRAY READ IN REVERSE ORDER
	void string(String st[])
	{
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.println(st[i]);
		}
	}
	//1D INT ARRAY FIND THE SUM OF ALL THE ELEMENTS
	void sum(int a[]) {
		int sum=0;
		{
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
			System.out.println(sum);
		}
	}
	//1D CHAR ARRAY DISPLAY THE VOWELS SEPARATELY
	void vowel(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			switch(ch[i])
			{
			case 'a': case 'A': case 'e': case 'E': case 'i': case 'I': case 'o': case 'O': case 'u': case 'U':
				System.out.println(ch[i]+ " : is vowel");
				break;
			default:
				break;
			}
		}
	}
	//2D 3*3 INT ARRAY READ LAST ROW ELEMENTS
	void twodarray(int a[][])
	{
		for(int i=0;i<a[2].length;i++)
		{
			System.out.println(a[2][i]+" ");
		}
	}
	//2D 3*3 INT ARRAY FIND THE SUM OF FIRST ROW ELEMENTS
	void twoarray(int x[][])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[0][i];
		}
		System.out.println(sum);
	}
	//SUBTRACTION OF 2D MATRIX
	void Subarray(int x[][],int y[][])
	{
		if((x.length==y.length) &&(x[0].length==y[0].length))
		{
			int z[][]=new int [x.length][x[0].length];
			for(int i=0;i<x.length;i++)
			{
				for( int j=0;j<x[i].length;j++)
				{
					z[i][j]=x[i][j]-y[i][j];
				}
			}
			for(int m=x.length-1;m>=0;m--)
			{
				for( int n=0;n<x[m].length;n++)
				{
					System.out.print(z[m][n]+" ");
				}
				System.out.println();
			}
		}
	}
			
	//2D STRING CONCATE
	void concat(String str[][])
	{
		String s="";
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++ )
			{
				s=s+str[i][j];
			}
		}
		System.out.println(s);
	}
	//1D CHAR CONCATE
	void concat1(char ch[])
	{ String s="";
		for(int i=0;i<ch.length;i++)
		{
			s=s+ch[i];
		}
		System.out.println(s);
	}
	//SQUARE EACH ELEMENT IN 1D ARRAY AND FIND ITS SUM
	void square(int x[])
	{
		int z=0;
		for(int i=0;i<=(x.length-1);i++)
		{
			z=z+(x[i]*x[i]);
		}
		System.out.println(z);
	}
}


public class OneDemo {

	public static void main(String[] args) {
		Demo ob=new Demo();
		System.out.println("BYTE ARRAY");
		Byte x[]= {10,20,30,40,50,60,70,80,90,100};
		ob.Arrays(x);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("SHORT ARRAY");
		short a[]= {10,20,30,40,50,60,70,80,90,100};
		ob.Arrays(a);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("INT ARRAY");
		int z[]= {10,20,30,40,50,60};
		ob.intarrays(z);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("STRING ARRAY");
		String s[]={"Apple","mango","Orange","Grapes"};
		ob.string(s);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("SUM");
		int y[]= {5,10,15};
		ob.sum(y);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("VOWEL");
		char ch[]= {'a','G','I','y','t'};
		ob.vowel(ch);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("TWOD ARRAY");
		int q[][]= {{1,2,3},{4,5,6},{7,8,9}};
		ob.twodarray(q);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("TWO D ARRAYS");
		int p[][]= {{10,20,30},{40,50,60},{70,80,90}};
		ob.twoarray(p);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("SUB");
		int d[][]= {{10,11,12},{13,14,15},{16,17,18}};
		int e[][]= {{1,2,3},{4,5,6},{7,8,9}};
		ob.Subarray(d,e);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("CONCAT STRING");
		String o[][]= {{"hi","hello","world"},{"hope","open","hard"},{"joke","hope","kite"}};
		ob.concat(o);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("CONCAT CHAR");
		char l[]= {'c','u','p'};
		ob.concat1(l);
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("SQUARE");
		int g[]= {1,2,3};
		ob.square(g);
	}	

}
