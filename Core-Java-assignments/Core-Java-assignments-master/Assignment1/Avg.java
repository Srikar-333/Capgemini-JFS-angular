import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		
       int A,B,C,total,Average;
       Scanner sc = new Scanner(System.in);
       
       System.out.println("A value is");
       A=sc.nextInt();
       
       System.out.println("B value is");
       B=sc.nextInt();
       
       System.out.println("C  value is");
       C=sc.nextInt();
       
    	   total=A+B+C;
    	   Average=total/3;
        
    	   System.out.println("Total is:" +total);
    	   System.out.println("Average is:" +Average);
       }
	}

