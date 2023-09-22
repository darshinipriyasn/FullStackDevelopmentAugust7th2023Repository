
/*15 14 13 12 11
10 9 8 7 
6 5 4 
3 2 
1 
*/
package dowhilepattern;

public class FifteenRevDoWhile {

	public static void main(String[] args) {
		int num=15,i=5;
		do
		{
			int k=1;
			do
			{
				System.out.print(num+" ");
				k++;
				num--;
			}while(k<=i);
			System.out.println();
			i--;
		}while(i>=1);

	}

}
