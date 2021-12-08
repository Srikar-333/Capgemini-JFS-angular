import java.util.Scanner;

class Arraysearch {
  public static void main(String[] args) {

    int[] num = {1, 2, 3, 4, 5,22,44,57,69,46,32,55,90,11,37};
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    int toFind = sc.nextInt();
   
    boolean found = false;
	for (int n : num) {
      if (n == toFind) {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
  }
}