/*5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
*/

package forpatterns;

public class FiveTableFor {

	public static void main(String[] args) {
		int a=5;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				
				System.out.print(a+" ");
				a+=5;
			
			}
			System.out.println();
		}


	}

}
