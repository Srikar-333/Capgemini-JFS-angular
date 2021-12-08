package ExceptionHandlingAssignments;

import java.util.Scanner;

public class ExcepHand1
{
    public static void main(String args[])
    {
    	Scanner sc= new Scanner(System.in);
    	 
        try {
            int num1,num2;
          
            System.out.println("Enter a Number:");
            num1=sc.nextInt();
            System.out.println("Enter b Number:");
            num2=sc.nextInt();
            int c = num1/num2;
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
    }
}