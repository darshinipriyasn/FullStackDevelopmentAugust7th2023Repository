package com.gentech.arraydemo;

public class ScalarMul {

	public static void main(String[] args) {
		double x[][]= {{5.1,2.3,3.3},{4.6,5.5,5.2},{6.3,5.8,9.8}};
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print((x[i][j]*2)+" ");
			}
		
		System.out.println();
		
		}
	}

}
