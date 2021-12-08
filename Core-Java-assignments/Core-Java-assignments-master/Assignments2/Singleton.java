package intermediate_Assignments;

public class Singleton {

	String name;

	private static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {

	if (singleton == null)

	singleton = new Singleton();

	return singleton;

	}

	public void getContactDetails() {
		
		System.out.println("Contact details");
		
	}
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		
		
	}
}
