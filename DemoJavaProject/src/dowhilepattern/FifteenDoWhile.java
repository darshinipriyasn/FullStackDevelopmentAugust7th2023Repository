/*1
2 3
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
package dowhilepattern;

public class FifteenDoWhile {

	public static void main(String[] args) {
		int i=1,num=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(num+" ");
				num++;
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);
		

	}

}
