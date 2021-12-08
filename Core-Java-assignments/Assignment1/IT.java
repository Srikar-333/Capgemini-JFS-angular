import java.util.Scanner;

	public class IT {

		public static void main(String[] args) {
			
	        double tax=0,CTC;
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter Annual income");
	        
	        CTC=sc.nextDouble();
	        
	        if(CTC<=180000) 
	        	tax=0;
	       
	        else if(CTC>180000 && CTC<=300000) 
	        	tax=0.1*CTC;
	        
	        
	        else if(CTC>300000 && CTC<=500000) 
	        	tax=0.2*CTC;
	       
	        
	        else if(CTC>500000 && CTC<=1000000)
	        	tax=0.3*CTC;
	    
	        else if(CTC>1000000)
	        	tax=0.4*CTC;
	        System.out.println("Annual Tax is "+tax);
	  
		}
		}

