package lab9;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		   
		Dem2 obj = ()->{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string: ");
			return sc.next().replace(""," ").trim();
		};
		System.out.println("Output string: "+ obj.addSpace());
	}

}
