import java.util.Scanner;

public class Studmarks {
	
		public static void main(String[] args) {
			
	         int Sub1,Sub2,Sub3;
	         
	         Scanner sc=new Scanner(System.in);
	         
	         System.out.println("Enter First Subject marks");
	         Sub1=sc.nextInt();
	         
	         System.out.println("Enter Second Subject marks");
	         Sub2=sc.nextInt();
	         
	         System.out.println("Enter Third Subject marks");
	         Sub3=sc.nextInt();
	         
	         System.out.println("Result of Student is:");
	         
	         if(Sub1>=60 && Sub2>=60 && Sub3>=60) {
	        System.out.println("Passed");
	         }
	         else if((Sub1>=60 && Sub2>=60)||(Sub1>=60 && Sub3>=60)||(Sub2>=60 && Sub3>=60)) {
	        System.out.println("Promoted");	 
	         }
	         
	         else if(Sub1<60 && Sub2<60 && Sub3<60){
	        	 System.out.println("Fail");	
	        	 
	        	 sc.close();
	         }
	        	 
	         }


	}

