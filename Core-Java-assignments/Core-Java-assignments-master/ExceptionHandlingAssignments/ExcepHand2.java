package ExceptionHandlingAssignments;

import java.util.Scanner;
import java.lang.UnsupportedOperationException;

public class ExcepHand2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 2 numbers to divide:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		try  {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			sc.close();
		throw new UnsupportedOperationException("entering 0 while dividing gives error");
		}
		sc.close();
	}

}