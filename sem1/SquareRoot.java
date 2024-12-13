package sem1;

import java.lang.Math;
import java.util.Scanner;
public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a =sc.nextFloat();
		
		double s = Math.sqrt(a);
		System.out.println("The square root of " + a + " is " + s);

		if(a>=100) 
		{
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}