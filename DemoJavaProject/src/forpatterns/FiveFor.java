/*
5 5 5 5 5
5 5 5 5 
5 5 5 
5 5 
5
 */
package forpatterns;

public class FiveFor {

	public static void main(String[] args) {      
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print("5 ");
			}
			System.out.println();
		}

	}

}
