/*2
2 2 
2 2 2 
2 2 2 2 
2 2 2 2 2 
*/
package whilepattern;

public class TwoWhile {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(2+" ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
