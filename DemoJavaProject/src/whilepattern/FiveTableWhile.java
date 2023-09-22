/*5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
*/
package whilepattern;

public class FiveTableWhile {

	public static void main(String[] args) {
		int num=5,i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(num+" ");
				num+=5;
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
