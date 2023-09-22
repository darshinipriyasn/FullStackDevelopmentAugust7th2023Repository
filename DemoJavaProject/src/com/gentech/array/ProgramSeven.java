package com.gentech.array;

public class ProgramSeven {

	public static void main(String[] args) {
		int a[]= {2,4,6,8};
		int b[]= {10,20,30,40,50,60};
		int lena=a.length;
		int lenb=b.length;
		
		int arrc[]=new int[lena+lenb];
		int k=0;
		for (int i=0;i<lena;i++)
		{
			arrc[k]=a[i];
			k++;
		}
		for(int j=0;j<lenb;j++)
		{
			arrc[k]=b[j];
			k++;
		}
		for (int m=0;m<arrc.length;m++)
		{
			System.out.println(arrc[m]+" "); 
		}
	

	}

}
/*2 
4 
6 
8 
10 
20 
30 
40 
50 
60 
*/
