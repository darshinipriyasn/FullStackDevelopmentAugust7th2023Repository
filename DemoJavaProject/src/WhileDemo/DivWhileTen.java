package WhileDemo;

public class DivWhileTen {

	public static void main(String[] args) {
		int  count=0, i=250;
		while(i<=500)
		{
			if(i%10==0)
			{
				count=count+1;
			}i++;
		}
		System.out.println(count);

		
	}

}


