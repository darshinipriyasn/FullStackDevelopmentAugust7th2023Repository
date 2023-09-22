package com.gentech.arraydemo1;

public class Patternone {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i>=50;i--)
		{
			if(i%4==0)
			{
				count=count+1;
			}
		}
		System.out.println("# of elements: "+count);
		int x[]=new int[count];
		int k=0;
		for(int j=100;j>=50;j--)
		{
			if(j%4==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length-1;z>=0;z--)
		{
			System.out.println(x[z]);
		}

	}

}

