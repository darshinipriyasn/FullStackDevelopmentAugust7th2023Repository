package com.gentech.arraydemo;

public class OneDToTwoD {

	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6};
		int matrix[][]= new int[2][3];
		int k=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				matrix[i][j]=x[k];
				k++;
			}
		}
		for(int m=0;m<matrix.length;m++)
		{
			for(int n=0;n<matrix[0].length;n++)
			{
				System.out.print(matrix[m][n]+" ");
			}

			System.out.println();
		}
	}

}
