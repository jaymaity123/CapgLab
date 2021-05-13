package lb1;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args)
	{
		int x,y;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		y = s.nextInt();
		System.out.println("------Prime Numbers upto"+" "+y+"---------");
		System.out.println(1);
		for(int i=2; i<y; i++)
		{
			x=0;
			for(int j=2; j<i; j++)
			{
				if(i%j ==0)
				x=1;
			}
			
			if(x==0)
				
				System.out.println(i);
		}
	}
}
