package lb1;
import java.util.Scanner;
public class CubeOfDigits {

	public int Cube(int x)
	{
		int sum=0;
		int r=0;
		while(x!=0)
		{
			r= x%10;
			sum+=r*r*r;
			x=x/10;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number=");
		int k = sc.nextInt();
		System.out.println("Cube of the Digit is ---->");
		CubeOfDigits cb = new CubeOfDigits();
		int x = cb.Cube(k);
        System.out.println(x);
	}
}
