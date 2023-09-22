package com.gentech.programs;
class Demo11
{
	static char[] getalphabets()
	{
		int i=0;
		char res[]=new char[26];
		for( char ch='A';ch<='Z';ch++)
		{
			res[i]=ch;
			i++;
		}
		return res;
	
}
}

public class Alphabets {

	public static void main(String[] args) {
		 Demo11.getalphabets();
	}
}
