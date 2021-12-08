package beanCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
    public static void main(String[] args) {
    	
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
        context.registerShutdownHook();

        BeanLifeCycle beanLifeCycle=(BeanLifeCycle)context.getBean("LifeCycle");
        beanLifeCycle.display();
    }
}