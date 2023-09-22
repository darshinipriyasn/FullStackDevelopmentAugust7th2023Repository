package com.gentech.array;

public class TwoDStringArrayReverse {

	public static void main(String[] args) {
		String str[][]= {{"hi","world","hello"},{"apple","mango","orange"},{"pink","red","white"}};
		for(int i=str.length-1;i>=0;i--)
		{
			for(int j=str[i].length-1;j>=0;j--)
			{
			   System.out.print(str[i][j]+" ");	
			}
			System.out.println();
		}

	}

}
/*white red pink 
orange mango apple 
hello world hi 
*/
