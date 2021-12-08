package questionAssign;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	        question question1 = ((BeanFactory) applicationContext).getBean("question1",questionAssign.question.class);

	        System.out.println();
	        System.out.println("Loading questions : Question1..");
	        System.out.println("Question Id: "+question1.getQuestionId());
	        System.out.println("Question : "+question1.getQuestion());
	        System.out.println("Answer List : "+question1.getAnswerList().toString());
	        System.out.println("Answer Set : "+question1.getAnswerSet().toString());
	        System.out.println("Answer Map : "+question1.getAnswerMap().toString());

	    }

	}

