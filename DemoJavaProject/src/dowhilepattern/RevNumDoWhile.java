/*1 2 3 4 5
1 2 3 4 
1 2 3 
1 2 
1 
*/
package dowhilepattern;

public class RevNumDoWhile {

	public static void main(String[] args) {
		int i=5;
		do
		{
			int k=1;
			do
			{
				System.out.print(k+" ");
				k++;
			}while(k<=i);
			System.out.println();
			i--;
		}while(i>=1);

	}

}
