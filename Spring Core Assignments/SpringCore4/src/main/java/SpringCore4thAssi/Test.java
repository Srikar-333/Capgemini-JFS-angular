package SpringCore4thAssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		States State=(States) context.getBean("states");
       State.print();
	}

}