package lb2;
import java.util.Scanner;
public class SecondSmallest {
	public static void main(String[] args) { 
		int[] a= new int[10];
		SecondSmallest ad= new SecondSmallest();
		a=ad.GetValue(a);
		int b= ad.getSecondSmallest(a);
		ad.printArray(b);
	}
	public int[] GetValue(int[] a)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println(" Enter the elements in A =");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		return a;
	}
	public int getSecondSmallest(int[]a)
	{
		int len= a.length;
		for (int i = 0; i < len; i++)   
		{  
			for (int j = i + 1; j < len; j++)
			{
				int tmp = 0;  
				if (a[i] > a[j])   
				{  
				tmp = a[i];  
				a[i] = a[j];  
				a[j] = tmp;  
				}
			}
		}
		return a[1];
			
	}
	public void printArray(int b)
	{  
		System.out.println("Second Smallest=\n"+b);
	}
}
