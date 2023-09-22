package com.constructor.assignment;
class Vowels
{
	void Vowel(char ch)
	{
		switch(ch)
		{
		case 'a':case 'A':
			System.out.println("vowel:"+ch);
			break;
		case 'e':case 'E':
			System.out.println("vowel:"+ch);
			break;
		case 'i':case 'I':
			System.out.println("vowel:"+ch);
			break;
		case 'o':case 'O':
			System.out.println("vowel:"+ch);
			break;
		case 'u':case 'U':
			System.out.println("vowel:"+ch);
			break;
		default:
			System.out.println("consonant:"+ch);

		}
	}
	void Arrays(char ch[][])
	{
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[i].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]);
			}
			System.out.println();
			
		}
		
	}
	
	void Reverse(int x[])
	{
		int y[]=new int[x.length];
		int k=0;
		{
			for(int i=0;i<x.length;i++)
			{
				y[i]=x[i];
				k++;
				
			}
			
			for(int j=(y.length-1)/2;j>=0;j--) {
		
		System.out.print(y[j]+" ");
	}
}
}}

public class VowelMethod {

	public static void main(String[] args) {
		Vowels o= new Vowels();
		o.Vowel('a');
		o.Vowel('A');
		o.Vowel('b');
		char a[][]= {{'a','b','c'},{'x','y','z'}};
        o.Arrays(a);
        int x[]= {10,20,30,40};
        o.Reverse(x);
	}


}
	
	


