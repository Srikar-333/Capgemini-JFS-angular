package intermediate_Assignments;

import java.util.Scanner;

class CurrentAccount extends SavingsFD {

    public int getCash(int deposit) {
    	return deposit;

    }
}

class SavingsAccount extends SavingsFD {

    public int getCash(int fixed) {
    	return fixed;
    	
    }
}

public class SavingsFD {
	public int getCash(int dep, int fixed){
    	int Total = dep + fixed;
		return Total;

    }
    public static void main(String[] args) {
    	
    	Scanner myInput = new Scanner( System.in );
        int dep;
        int fixed;
        int total;
    	
    	System.out.print( "Enter Deposit: " );
        dep = myInput.nextInt();
        System.out.print( "Enter fixed deposit: " );
        fixed = myInput.nextInt();
        total = dep + fixed;
        System.out.printf( "Sum = %d\n", total );
        
    	CurrentAccount c = new CurrentAccount();
    	System.out.println("Cash credited in bank is : "+c.getCash(dep));
    	SavingsAccount s = new SavingsAccount();
    	System.out.println("Fixe deposit in bank is : "+s.getCash(fixed));
    	SavingsFD a = new SavingsFD();
    	System.out.println("Total amount credited in bank is : "+a.getCash(dep,fixed));

    }
}