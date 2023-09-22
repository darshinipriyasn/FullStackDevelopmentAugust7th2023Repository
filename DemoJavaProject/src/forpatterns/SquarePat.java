/*1 
4 9 
16 25 36 
49 64 81 100 
*/
package forpatterns;

public class SquarePat {

	public static void main(String[] args) {
		int b=1;
		for (int i=1;i<=4;i++)
		{
			for (int k=1;k<=i;k++)
			{
				System.out.print(b*b+" ");
				b++;
			}
			System.out.println();
		}

	}

}
