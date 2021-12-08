package GenericsAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gen2 {

	public static void main(String[] args) {
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 key value details in integer and double respectively:");
		for(int i=1;i<=10;i++) {
			System.out.println("Enter value for index "+i);
			int s=sc.nextInt();
			double r=sc.nextDouble();
			map.put(s, r);
		}
		for(Map.Entry<Integer, Double> z : map.entrySet()){    
		    System.out.println("Key:"+z.getKey()+" Value:"+z.getValue());    
		   } 
		sc.close();
	}

}