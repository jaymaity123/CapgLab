package lab9;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		Dem1 obj = () ->{
			 Scanner s = new Scanner(System.in);
			 System.out.println("enter x and y values:");
	     return (long) Math.pow(s.nextInt(), s.nextInt());
		};
		System.out.println("x power y is: "+obj.powerOfX());
	}

}
