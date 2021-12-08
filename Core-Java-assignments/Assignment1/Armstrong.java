import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,a,temp,sum=0; 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number:");
        n = s.nextInt();
        temp=n; 
        while(n>0)  
        {  
        a=n%10;  
        n=n/10;  
        sum=sum+(a*a*a);  
        }  
        if(temp==sum)  
        System.out.println(temp+" is Armstrong number");   
        else  
        System.out.println(temp+" is not Armstrong number");  
         
       
       
	}

}