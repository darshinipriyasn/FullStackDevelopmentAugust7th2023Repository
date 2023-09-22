package com.gentech.array;

public class TwoDByteWhile {

	public static void main(String[] args) {
		int i=0;
		byte x[][]= {{4,8,16},{32,64,84},{102,114,124}};
		while(i<x.length)
		{
			int j=0;
			while(j<x[i].length)
			{
				System.out.print(x[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
			
		}
		

	}

}
/*
 4 8 16 
32 64 84 
102 114 124 
*/
