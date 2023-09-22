/*1
4 9 
16 25 36 
49 64 81 100 
*/
package whilepattern;

public class SquareWhile {

	public static void main(String[] args) {
		int num=1,i=1;
		while(i<=4)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(num*num+" ");
				num++;
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
