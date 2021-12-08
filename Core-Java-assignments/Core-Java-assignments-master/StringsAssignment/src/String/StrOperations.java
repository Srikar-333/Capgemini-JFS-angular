package String;

public class StrOperations {
	
	public static void main(String[] args) {
	
	 String str1="Java String pool refer a collection of string which are store in heap memory";
     str1=str1.toLowerCase();
     System.out.println(str1);
     
     str1=str1.toUpperCase();
     System.out.println(str1);
     
     str1=str1.replace("A", "$");
     System.out.println(str1);
     
     System.out.print(str1.contains("STRING"));
     
     
     
     
	}

}

