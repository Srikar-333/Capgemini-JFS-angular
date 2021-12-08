package ExceptionHandlingAssignments;

import java.util.Scanner;

public class ExcepHand3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    long id;
    double balance=500;
    double withdraw;
    double deposite;
    
    Scanner sc= new Scanner(System.in);
    
   
		try {
			System.out.println("Enter withdraw ammount");
			withdraw=sc.nextDouble();
			
			if(withdraw<balance) {
				System.out.println("successfully withdraw");
			}
			
			else {
				System.out.println("Enter correct ammount");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    //System.out.println("Enter deposite ammount");
    //deposite=sc.nextDouble();
    
	}

}