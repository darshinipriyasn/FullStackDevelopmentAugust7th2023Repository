/*1
4 9 
16 25 36 
49 64 81 100 
*/
package dowhilepattern;

public class SquareDoWhile {

	public static void main(String[] args) {
		int num=1,i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(num*num+" ");
				k++;
				num++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=4);

	}

}
