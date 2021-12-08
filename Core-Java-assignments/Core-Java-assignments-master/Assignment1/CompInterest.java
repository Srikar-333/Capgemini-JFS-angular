import java.util.Scanner;

public class CompInterest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     double rate,time,amt,SI,CI;
	     Scanner sc=new Scanner(System.in);
	     
	     System.out.println("Enter Amount:");
	     amt=sc.nextDouble();
	     
	     System.out.println("Enter Rate:");
	     
	     rate=sc.nextDouble();
	     
	     System.out.println("Enter Time:");
	     time=sc.nextDouble();
	     
	     SI=(amt*rate*time)/100;
	     
	     CI=amt*Math.pow(1.0+rate/100,time)-amt;
	     
	     System.out.println("Simple Interest is" +SI);
	     System.out.println("Compound Interest is" +CI);
		}

	}
